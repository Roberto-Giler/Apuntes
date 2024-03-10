package CarritoDeCompras;

public class Vacio implements EstadoCarrito{
    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("Agregando Producto con descripcion: "+producto.getDescripcion());

    }

    @Override
    public void cancelarCarrito() {
        System.out.println("vuelve a estar vacio");

    }

    @Override
    public void volverAlPuntoAnterior() {
        //no hace nada

    }

    @Override
    public void siguienteEstado() {
        System.out.println("El carrito pasa al siguiente estado Cargando");

    }
}
