package CarritoDeCompras;

public class Cerrado implements EstadoCarrito{
    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("no se puede agregar");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("No se puede");

    }

    @Override
    public void volverAlPuntoAnterior() {
        System.out.println("No se puede");

    }

    @Override
    public void siguienteEstado() {
        System.out.println("no se puede");

    }
}
