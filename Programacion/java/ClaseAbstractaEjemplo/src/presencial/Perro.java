package presencial;

public class Perro extends Animal{
 private Integer tamanio;

    public Perro(String nombre, String raza, Integer tamanio) {
        super(nombre, raza);
        this.tamanio = tamanio;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }
}
