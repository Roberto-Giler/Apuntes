package ArbolGeneologico;

public class Persona implements ComponenteGeneologico {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        System.out.println("el nombre de la persona es: "+nombre);
    }
}
