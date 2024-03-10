package presencial;

public class Producto {
    private String nombre; //lower Camel Case nombreApellido
    private Double precio;

    public Producto(String nombre, double precio) {
        this.nombre= nombre;
        this.precio= precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
