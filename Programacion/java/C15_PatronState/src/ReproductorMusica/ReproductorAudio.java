package ReproductorMusica;

public class ReproductorAudio {
    //asociamos
    private Estado estado;
    //para darle vida, necesitamos instanciarlo.

    public ReproductorAudio(){
        estado= new EstadoDetenido(); //el reproductor va a inicializarse detenido.-
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void reproducir(){
        estado.reproducir();
    }
    public void pausar(){
        estado.pausar();
    }
    public void detener(){
        estado.detener();
    }
}
