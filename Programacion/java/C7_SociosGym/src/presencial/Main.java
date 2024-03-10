package presencial;

public class Main {
    public static void main(String[] args) {
        SocioPileta jorgito= new SocioPileta(1,"Jorgito",200.0,"Musculacion",40.0,true);
        SocioPileta nicolas= new SocioPileta(2,"Nicolas",200.0,"Musculacion",40.0,false);
        jorgito.habilitacionPileta();
        nicolas.noHabilitadoPileta();
        System.out.println("Costo mensual para : "+jorgito.getNombre()+" valor mensual: "+jorgito.calcularCostoMensual());
        System.out.println("Cliente : "+nicolas.getNombre()+" valor mensual requerido  abonar: "+nicolas.calcularCostoMensual());
    }
}
