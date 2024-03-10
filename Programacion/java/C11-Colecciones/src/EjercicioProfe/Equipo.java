package EjercicioProfe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> listaJugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        listaJugadores= new ArrayList<>();
    }
    public void addJugador(Jugador jugador){
        //aca va todas las acciones a realizar
        listaJugadores.add(jugador);
    }
    public void mostrarJugadoresTitulares(){
        System.out.println("*****************Jugadores Titulares******************");
        List<Jugador> listaOrdenada= new ArrayList<>();
        for (Jugador jugador:listaJugadores ) {
            if(jugador.isTitular()){
                listaOrdenada.add(jugador);
            }
        }
        Collections.sort(listaOrdenada);
        for (Jugador jugador : listaOrdenada) {
            System.out.println("Nombre : "+jugador.getNombre()+ "Numero de camiseta: "+jugador.getNumeroDeCamiseta());

        }
    }
    public int getCantidadDeJugadoresLesionados(){
        int cantidadDeLesionadosYTitulares=0;
        for (Jugador jugador : listaJugadores) {
            if(jugador.isTitular()&& jugador.isLesionado()){
                cantidadDeLesionadosYTitulares++;
            }

        }
        return cantidadDeLesionadosYTitulares;
    }

}
