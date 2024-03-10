package ReproductorMusica;

public class EjemploDeReproducirDeAudio {
    public static void main(String[] args) {
        //necesito crear al objeto Reproductor de Audio
        ReproductorAudio winnamp = new ReproductorAudio();
        winnamp.reproducir();
        winnamp.pausar();
        winnamp.setEstado(new EstadoReproduciendo());
        winnamp.reproducir();
        winnamp.pausar();
        winnamp.setEstado(new EstadoDetenido());
        winnamp.detener();
    }
}
