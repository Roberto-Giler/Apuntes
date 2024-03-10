package presencial;

public class Main {
    public static void main(String[] args) {
        Perro mascota1= new Perro("tommy","negro","bull dog",4);
        Perro mascota2= new Perro("callejero","gris");
       mascota1.emitirSonido();
       mascota2.emitirSonido();
       Animal mascotaX= new Perro("firulais","blanco");
       Gato mascota4= new Gato("michi","verde",true,15);
       mascota4.emitirSonido();
       mascotaX.emitirSonido();

    }
}
