package dh.backend.dao.impl;

import dh.backend.dao.IDao;
import dh.backend.db.H2Connection;
import dh.backend.model.Domicilio;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.List;

public class DomicilioIDaoH2 implements IDao<Domicilio> {
    private Logger LOGGER =Logger.getLogger(DomicilioIDaoH2.class);

    private  static String SQL_INSERT="INSERT INTO DOMICILIOS VALUES (DEFAULT,?,?,?,?)";
    private static String SQL_SELECT_ID="SELECT * FROM DOMICILIOS WHERE ID = ?";


    @Override
    public Domicilio Registrar(Domicilio domicilio) {
        Connection connection = null;
        Domicilio domicilioARetornar= null;
        try{
            connection= H2Connection.getConnection();
            connection.setAutoCommit(false);


            PreparedStatement preparedstatement=connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            preparedstatement.setString(1,domicilio.getNumero());
            preparedstatement.setString(2, domicilio.getCalle());
            preparedstatement.setString(3,domicilio.getLocalidad());
            preparedstatement.setString(4,domicilio.getProvincia());
            preparedstatement.executeUpdate();

            ResultSet resultset=preparedstatement.getGeneratedKeys();

           while(resultset.next()){
               Integer id=resultset.getInt(1);

               domicilioARetornar=new Domicilio(id,domicilio.getNumero(),domicilio.getCalle(),domicilio.getLocalidad(),domicilio.getProvincia());
               LOGGER.info("Paciente persistido: "+ domicilioARetornar);

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


        return domicilioARetornar;
    }

    @Override
    public Domicilio BucarPorId(int id) {
        Connection connection = null;
        Domicilio domicilioEncontrado=null;
        try{
            connection= H2Connection.getConnection();

            PreparedStatement preparestament=connection.prepareStatement(SQL_SELECT_ID);
            preparestament.setInt(1,id);

            ResultSet resultSet =preparestament.executeQuery();

            while (resultSet.next()){
                Integer idEncontrado = resultSet.getInt(1);
                String numero= resultSet.getString(2);
                String calle= resultSet.getString(3);
                String localidad= resultSet.getString(4);
                String provincia= resultSet.getString(5);

                domicilioEncontrado=new Domicilio(idEncontrado,numero,calle,localidad,provincia);

                LOGGER.info("Domicilio encontrado: "+ domicilioEncontrado);

            }
        }catch (Exception e) {
            LOGGER.info(e.getMessage());
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch(SQLException e) {
                LOGGER.info(e.getMessage());
                e.printStackTrace();

            }
        }

        return domicilioEncontrado;
    }

    @Override
    public List<Domicilio> buscarTodos() {
        return null;
    }

    @Override
    public Domicilio DardeAlta(Domicilio domicilio) {
        return null;
    }
}
