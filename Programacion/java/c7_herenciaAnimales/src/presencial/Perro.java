package presencial;

public class Perro extends Animal {
    private String raza;
    private Integer edad;

    public Perro(String nombre, String color) {
        super(nombre, color);
    }

    public Perro(String nombre, String color, String raza, Integer edad) {
        super(nombre, color);
        this.raza = raza;
        this.edad = edad;
    }

    @Override
    public String emitirSonido() {
        System.out.println("Guau Guau");
        return super.emitirSonido();
    }

}
