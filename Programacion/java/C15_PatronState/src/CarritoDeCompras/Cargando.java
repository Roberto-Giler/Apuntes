package CarritoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Cargando implements EstadoCarrito{
    private List<Producto> listaDeproductos= new ArrayList<>();
    @Override
    public void agregarProducto(Producto producto) {
        listaDeproductos.add(producto);
        System.out.println("Agregando producto a la lista: "+producto.getNombre());

    }

    @Override
    public void cancelarCarrito() {
        listaDeproductos.clear();
        System.out.println("Carrito cancelado");

    }

    @Override
    public void volverAlPuntoAnterior() {
        cancelarCarrito();

    }

    @Override
    public void siguienteEstado() {
        System.out.println("El carrito pasa a estar pagando");

    }
}
