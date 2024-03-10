package MascotaVirtual;

public class Tamagotchi {
    private EstadoTamagotchi estado;
    
    public Tamagotchi(){
        estado= new Hambriento();
    }
    public void recibirComida(){
        estado.recibirComida();
        if(estado instanceof Hambriento) {
            estado = new Feliz();
        } else if (estado instanceof Triste) {
            estado= new Hambriento();
        } else if (estado instanceof Sediento) {
            estado= new Triste();
                   }
    }
    public void recibirBebida(){
        estado.recibirBebida();
        //cambiemos al estado correspondiente
        if (estado instanceof Feliz){
            estado= new Hambriento();
        } else if (estado instanceof Triste) {
            System.out.println("hace 3 beep y titila la pantalla");
                    } else if (estado instanceof  Hambriento) {
            estado= new Triste();
                    }

    }
    public void recibirMimos(){
        estado.recibirMimos();
        if(estado instanceof Triste){
            estado= new Feliz();
        }
    }
}
