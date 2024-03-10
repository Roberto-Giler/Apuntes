package presencial;

public class EmpleadoRelacionDependencia extends Empleado{
    private double sueldoMensual;

    public EmpleadoRelacionDependencia(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo(int dias) {
        //la logica del proporcional a calcular el salario
         return (sueldoMensual/30)*dias;
    }
}
