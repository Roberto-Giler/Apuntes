package CarritoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
        private EstadoCarrito estado;
        private List<Producto> productos= new ArrayList<>();

    public Cliente(){
        estado= new Vacio();
    }

    public void setEstado(EstadoCarrito estado) {
        this.estado = estado;
    }
    public void agregarProducto(Producto producto){
        estado.agregarProducto(producto);
        productos.add(producto);
    }
    public void cancelarCarrito(){
        estado.cancelarCarrito();
        productos.clear();
    }
    public void volverAlPuntoAnterior(){
        estado.volverAlPuntoAnterior();
    }
    public void siguienteEstado(){
        estado.siguienteEstado();
    }
}
