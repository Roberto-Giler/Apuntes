package EjercicioProfe;

public class Jugador implements Comparable<Jugador> {
    private int numeroDeCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titular;

    public Jugador(Integer numeroDeCamiseta, String nombre, boolean lesionado, boolean titular) {
        this.numeroDeCamiseta = numeroDeCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public Integer getNumeroDeCamiseta() {
        return numeroDeCamiseta;
    }

    public void setNumeroDeCamiseta(Integer numeroDeCamiseta) {
        this.numeroDeCamiseta = numeroDeCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        return Integer.compare(this.numeroDeCamiseta,otroJugador.numeroDeCamiseta);
    }
}
