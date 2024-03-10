package Trencito;

public class Principal {
    public static void main(String[] args) {
        Rectangulo rectangulo= new Rectangulo(5,4);
        Circulo circulo= new Circulo(1);
        Circulo circulo2= new Circulo(1);
        Circulo circulo3= new Circulo(1);
        ElementoCompuesto vagon= new ElementoCompuesto();
        vagon.agregarFigura(rectangulo);
        vagon.agregarFigura(circulo);
        vagon.agregarFigura(circulo2);
        vagon.agregarFigura(circulo3);
        double areaTotal= vagon.calcularArea();
        System.out.println("El area total del vagon es: "+areaTotal);
    }
}
