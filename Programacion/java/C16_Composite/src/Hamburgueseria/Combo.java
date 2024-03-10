package Hamburgueseria;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto {
    private List<Producto>  productos= new ArrayList<>();

    public Combo(String nombre) {
        super(nombre, 0);
    }
    public void agregarProductos(Producto producto){
        productos.add(producto);
    }

    @Override
    public double getPrecio() {
        double precioTotal=0;
        for (Producto producto : productos) {
            precioTotal+= producto.getPrecio();//<--- precioTotal= precioTotal+producto.getPrecio;
            //apliquemos un 10%
        }
        return precioTotal*0.9;
    }
}
