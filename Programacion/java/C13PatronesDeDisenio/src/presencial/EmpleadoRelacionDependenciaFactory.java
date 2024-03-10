package presencial;

public class EmpleadoRelacionDependenciaFactory implements EmpleadoFactory{

    @Override
    public Empleado crearEmpleado() {
        return new EmpleadoRelacionDependencia(1000);
    }
}
