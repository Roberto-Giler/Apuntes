package presencial;

import java.sql.Date;

public class Cliente {
    public static void main(String[] args) {
        ImpresoraEpson L4150= new ImpresoraEpson("l4150","usb",new Date(2023,8,17),10,50.0);
        ImpresoraCannon stylus= new ImpresoraCannon("mod1","wi fi",new Date(2023,9,20),4,20.0);


        System.out.println(L4150.imprimir());
        System.out.println(stylus.imprimir());
    }
}
