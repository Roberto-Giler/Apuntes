package dh.backend.dao.impl;

import dh.backend.dao.IDao;
import dh.backend.db.H2Connection;
import dh.backend.model.Domicilio;
import dh.backend.model.Paciente;
import org.apache.log4j.Logger;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;

public class PacienteIDaoH2 implements IDao<Paciente> {
    private Logger LOGGER =Logger.getLogger(DomicilioIDaoH2.class);
    private static String SQL_SELECT_ID="SELECT * FROM PACIENTES WHERE ID = ?";

    private  static String SQL_INSERT="INSERT INTO PACIENTES VALUES (DEFAULT,?,?,?,?,?)";
    @Override
    public Paciente Registrar(Paciente paciente) {

        Connection connection = null;
        Paciente PacienteARetornar= null;
        DomicilioIDaoH2 domicilioDaoH2= new DomicilioIDaoH2();

        try{
            Domicilio DomicilioPaciente=null;
            connection= H2Connection.getConnection();
            connection.setAutoCommit(false);

            DomicilioPaciente=domicilioDaoH2.Registrar(paciente.getDomicilio());
            PreparedStatement preparedstatement=connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            preparedstatement.setString(1,paciente.getApellido());
            preparedstatement.setString(2, paciente.getNombre());
            preparedstatement.setString(3,paciente.getDNI());;
            preparedstatement.setDate(4, Date.valueOf(paciente.getFechaIngreso()));
            preparedstatement.setInt(5,DomicilioPaciente.getId());

            preparedstatement.executeUpdate();

            ResultSet resultset=preparedstatement.getGeneratedKeys();

            while(resultset.next()){
                int id=resultset.getInt(1);

                PacienteARetornar=new Paciente(id,paciente.getApellido(),paciente.getNombre(),paciente.getDNI(),paciente.getFechaIngreso(),DomicilioPaciente);
                LOGGER.info("Paciente guardado: "+ PacienteARetornar);

            }

            connection.commit();
            connection.setAutoCommit(true);

        } catch (Exception e) {
            if(connection!=null){
                try {
                    connection.rollback();
                }catch (SQLException ex){
                    LOGGER.info(ex.getMessage());
                    ex.printStackTrace();
                }
                LOGGER.info(e.getMessage());
                e.printStackTrace();

            }
        }finally {
            try {
                connection.close();
            } catch(SQLException e) {
                LOGGER.info(e.getMessage());
                e.printStackTrace();

            }
        }


        return PacienteARetornar;
    }

    @Override
    public Paciente BucarPorId(int id) {
        Connection connection=null;
        Paciente pacienteEnontrado=null;
        DomicilioIDaoH2 domicilioIDaoH2=new DomicilioIDaoH2();

        try {
            connection=H2Connection.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(SQL_SELECT_ID);
            preparedStatement.setInt(1,id);
            ResultSet resulSet=preparedStatement.executeQuery();
            while(resulSet.next()){
                Integer idDevuelto=resulSet.getInt(1);
                String apellido=resulSet.getString(2);
                String nombre=resulSet.getString(3);
                String DNI=resulSet.getString(4);
                LocalDate fechaIngreso=resulSet.getDate(5).toLocalDate();
                Domicilio domicilioEntonctrado=domicilioIDaoH2.BucarPorId(resulSet.getInt(6));

                pacienteEnontrado=new Paciente(idDevuelto,apellido,nombre,DNI,fechaIngreso,domicilioEntonctrado);
                LOGGER.info("Paciente encontrado: "+pacienteEnontrado);
            }


        }catch (Exception e) {
            if(connection!=null){
                try {
                    connection.rollback();
                }catch (SQLException ex){
                    LOGGER.info(ex.getMessage());
                    ex.printStackTrace();
                }
                LOGGER.info(e.getMessage());
                e.printStackTrace();

            }
        }finally {
            try {
                connection.close();
            } catch(SQLException e) {
                LOGGER.info(e.getMessage());
                e.printStackTrace();

            }
        }

        return pacienteEnontrado;
    }

    @Override
    public List<Paciente> buscarTodos() {
        return null;
    }

    @Override
    public Paciente DardeAlta(Paciente paciente) {
        return null;
    }
}
