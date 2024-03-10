package MascotaVirtual;

public class Triste implements EstadoTamagotchi{
    @Override
    public void recibirComida() {
        System.out.println("Tamagotchi se descompone del estomago");
    }

    @Override
    public void recibirBebida() {
        System.out.println("titila la pantalla");

    }

    @Override
    public void recibirMimos() {

    }
}
