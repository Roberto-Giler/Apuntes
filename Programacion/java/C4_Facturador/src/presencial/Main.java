package presencial;

public class Main {
    public static void main(String[] args) {
        //prueba de funcionamiento
        //que necesito para hacer funcionar mi sistema
        Producto bebida= new Producto("Cola Cola",450.0);
        Cliente cliente= new Cliente("Jorgito","La Rioja");
        //cliente.comprar(bebida);
        bebida.setNombre("pepsi");
        cliente.setNombre("Jeronimo");
        Facturador facturador= new Facturador(cliente,bebida);
        facturador.facturar();
    }
}
