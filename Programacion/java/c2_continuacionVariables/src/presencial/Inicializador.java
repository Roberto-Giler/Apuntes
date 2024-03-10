package presencial;

public class Inicializador {
    public static void main(String[] args) {
        System.out.println("*****************Bienvenidos************");
        Mascota manchitas= new Mascota("Manchitas",2,1.5,"Guau Guau","Perro");
        System.out.println(manchitas.toString());
        Mascota nemo= new Mascota("nemo",1,0.14,"glup glup","Pez");
        System.out.println("Nombre: "+nemo.nombre);
        System.out.println("Edad: "+nemo.edad);
        System.out.println("Comida: "+nemo.comida+"gr");
        System.out.println("Sonido: "+nemo.sonido);
        System.out.println("Tipo "+nemo.tipo);
    }
}
