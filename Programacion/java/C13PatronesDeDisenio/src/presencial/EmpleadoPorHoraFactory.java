package presencial;

public class EmpleadoPorHoraFactory implements EmpleadoFactory{

    @Override
    public Empleado crearEmpleado() {
        return new EmpleadoPorHora(7.0,14.0);
    }
}
