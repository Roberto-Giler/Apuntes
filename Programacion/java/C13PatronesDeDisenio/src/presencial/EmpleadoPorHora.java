package presencial;

public class EmpleadoPorHora extends Empleado{
    private double importePorHora;
    private double retencionImpuesto;

    public EmpleadoPorHora(double importePorHora, double retencionImpuesto) {
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public double calcularSueldo(int dias) {
        //calcular el salario + retenciones
        return (8*importePorHora*dias)*(1-retencionImpuesto/100);
    }
}
