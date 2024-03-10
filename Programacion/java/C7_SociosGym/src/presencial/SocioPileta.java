package presencial;

public class SocioPileta extends Socio{
    private Double costoPileta;
    private Boolean estaHabilitado; //estaHabilitado= true; estaHabilitado=false

    public SocioPileta(Integer numeroSocio, String nombre, Double cuotaMensual, String actividad, Double costoPileta, Boolean estaHabilitado) {
        super(numeroSocio, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = estaHabilitado;
    }
    public void habilitacionPileta(){
        estaHabilitado= true;
    }
    public void noHabilitadoPileta(){
        estaHabilitado= false;
    }

    @Override
    public Double calcularCostoMensual() {
        if (estaHabilitado){
            return super.calcularCostoMensual()+costoPileta;
        }else {
        return super.calcularCostoMensual();
    }
    }
}
