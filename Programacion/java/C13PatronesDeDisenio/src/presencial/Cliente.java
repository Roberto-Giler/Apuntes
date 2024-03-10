package presencial;

public class Cliente {
    public static void main(String[] args) {
        //necesito crear los objetos Empleados usando el factory
        EmpleadoFactory factoryRD= new EmpleadoRelacionDependenciaFactory();
        EmpleadoFactory factoryPH= new EmpleadoPorHoraFactory();
        Empleado empleadoRD= factoryRD.crearEmpleado();
        Empleado empladoPH= factoryPH.crearEmpleado();
        //calculemos el salario
        int diasTrabajados= 15;
        double sueldoRD= empleadoRD.calcularSueldo(diasTrabajados);
        double sueldoPH= empladoPH.calcularSueldo(diasTrabajados);
        System.out.println("Sueldo de Empleado en Relacion de Depedencia:  "+sueldoRD);
        System.out.println("Sueldo Empeado por Hora: "+sueldoPH);
    }
}
