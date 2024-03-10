package Trencito;

public class Circulo extends Figura{
    private double radio;
    private static final double PI=3.14;

    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return (radio*radio)*PI;
    }
}
