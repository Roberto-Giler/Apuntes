package ReproductorMusica;

public class EstadoDetenido implements Estado{
    @Override
    public void reproducir() {
        System.out.println("inicializando la reproduccion");
    }

    @Override
    public void pausar() {
        System.out.println("pausando la reproduccion");
    }

    @Override
    public void detener() {
        System.out.println("Reproduccion detenida");

    }
}
