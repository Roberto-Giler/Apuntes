package presencial;

public class Animal {
    private String nombre;
    private String color;

    public Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String emitirSonido(){
       return "mensaje";
    }
}
