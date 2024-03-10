package presencial;

public class Main {
    public static void main(String[] args) {
        Animal miAnimal;
        Animal otroAnimal;
        miAnimal = new Perro("Tomy", "caniche", 5);
        miAnimal.setNombre("Coco");
        System.out.println("El nombre es : " + miAnimal.getNombre() + " La raza es: " + miAnimal.getRaza());
        miAnimal.hacerSonido(); //el perro ladra

        miAnimal = new Gato("Michi", "siames");
        miAnimal.hacerSonido(); //el gato maulla

        //crear objetos
        Perro perro1 = new Perro("Jorgito", "caniche", 3);
        Gato gato1 = new Gato("michi2", "callejero");
        //EJEMPLOS DE CASTEO
        //casteo implicito
        //seguro no requiere intervencion de una operacion especial
        //implica una clase mayor a una clase menor
        Perro perro = new Perro("nombre", "raza", 1);
        Animal animal = perro;
        //casteo Explicito
        //implica convertir una clase menor a una mayor.
        Animal animalito = new Perro("nombre 1", "raza 2", 3);

        if (animalito instanceof Gato) {
            //por si
            Gato gato = (Gato) animalito;
        } else {
            System.out.println("no me puedo comportar como perro siendo gato");

        }
    }




    }

