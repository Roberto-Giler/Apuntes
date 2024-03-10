package CarritoDeCompras;

public class Pagando implements EstadoCarrito{

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("No se pueden agregar productos en esta instancia");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("compra cancelada");

    }

    @Override
    public void volverAlPuntoAnterior() {
        System.out.println("no se puede puede volver al punto anterior");

    }

    @Override
    public void siguienteEstado() {
        System.out.println("Compra realiza");

    }
}
