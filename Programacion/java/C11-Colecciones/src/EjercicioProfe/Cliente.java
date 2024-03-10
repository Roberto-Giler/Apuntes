package EjercicioProfe;

public class Cliente {
    public static void main(String[] args) {
        Equipo equipoA= new Equipo("Inter Miami");
        Jugador judgador1= new Jugador(5,"Lio Messi",false,true);
        equipoA.addJugador(judgador1);
        Jugador judgador2= new Jugador(11," Messi",true,true);
        judgador2.compareTo(judgador1);
        equipoA.addJugador(judgador2);
        System.out.println("Comparativa: "+judgador2.compareTo(judgador1));
        equipoA.addJugador(new Jugador(2,"David B",true,true));
        equipoA.addJugador(new Jugador(2,"Gino",true,true));
        equipoA.addJugador(new Jugador(2,"Diego",true,true));
        equipoA.mostrarJugadoresTitulares();
        equipoA.getCantidadDeJugadoresLesionados();

    }
}
