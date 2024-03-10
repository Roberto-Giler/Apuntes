package CarritoDeCompras;

public class PruebaDeCarrito {
    public static void main(String[] args) {
        Cliente carrito= new Cliente();
        //agreguemos los productos
        Producto producto1= new Producto("Coca Cola","Bebida Carbonatada",700.0);
        Producto producto2= new Producto("Cerveza", "Bebida Alcoholica",1200.0);
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        //cambie de estado
        carrito.siguienteEstado();
        //intentar agregar un producto cuando lo estoy pagando
        carrito.agregarProducto(new Producto("Perfume","cosmetico",100.0));
        //intentemos cancelar
        carrito.cancelarCarrito();
        //volvamos al punto anterior
        carrito.volverAlPuntoAnterior();
    }
}
