package Hamburgueseria;

public class Main {
    public static void main(String[] args) {
        CarritoDeCompras carritoDeCompras= new CarritoDeCompras();
        Sandwich burger= new Sandwich("Doble Bacon",50.0);
        Sandwich papasFritas= new Sandwich("Papas Rusticas",40.5);
        Combo combo1= new Combo("ComPapas");
        combo1.agregarProductos(burger);
        combo1.agregarProductos(papasFritas);
        carritoDeCompras.agregarProducto(combo1);
        double totalCompra= carritoDeCompras.calcularTotal();
        System.out.println("El total de su compra es: "+totalCompra);
    }
}
