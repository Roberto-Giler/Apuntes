package presencial;

public class Mascota {
    //Atributos: caracteristicas que tienen en comun los objetos
    //metodos: Son las acciones que realizarian los objetos en la vida real.
    String nombre;
    //int o Integer
       int edad;
       Double comida;
       String sonido;
       String tipo;

    public Mascota(String nombre, int edad, Double comida, String sonido, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.comida = comida;
        this.sonido = sonido;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        //“Manchitas tiene 2 años”
        //“Manchitas come un kilo y medio y hace guau guau”
        return "datos de la mascota{" +
                 nombre +" Tiene "+ edad+" años"+ '\n'+
                nombre+" Come "+ comida+"kg y hace "+ sonido+
                '}';
    }
}
