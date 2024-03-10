package MascotaVirtual;

public class Feliz implements EstadoTamagotchi{

    @Override
    public void recibirComida() {
        System.out.println("Tamagotchi esta sediento");
    }

    @Override
    public void recibirBebida() {
        System.out.println("Tamagotchi se pone hambriento");

    }

    @Override
    public void recibirMimos() {
        System.out.println("sin cambios pq esta feliz");
    }
}
