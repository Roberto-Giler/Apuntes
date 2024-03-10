package Hamburgueseria;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<Producto> productos= new ArrayList<>();
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public double calcularTotal(){
        double total=0;
        for (Producto producto : productos) {
            total+= producto.getPrecio();
                    }
        return total;
    }
}
