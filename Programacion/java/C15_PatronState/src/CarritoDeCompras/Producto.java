package CarritoDeCompras;

public class Producto {
private String nombre;
    private String descripcion;
    private Double precio;

    public Producto(String nombre,String descripcion, Double precio) {
        this.nombre= nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }
}
