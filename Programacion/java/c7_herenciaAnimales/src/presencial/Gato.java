package presencial;

public class Gato extends Animal {
    private boolean independiente;
    private Integer horasDeSueño;

    public Gato(String nombre, String color, boolean independiente, Integer horasDeSueño) {
        super(nombre, color);
        this.independiente = independiente;
        this.horasDeSueño = horasDeSueño;
    }

    @Override
    public String emitirSonido() {
        System.out.println("Miau miau");
        return super.emitirSonido();
    }
}
