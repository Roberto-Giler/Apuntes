package Vetenaria;

public class Main {
    public static void main(String[] args) {
        Veteriano veteriano= new Veteriano("Jorgito","gonzalez",1111111);
        Veteriano veteriano2= new Veteriano("Carlitos","gonzalez",1111111);


        System.out.println(veteriano.getNombre());
        System.out.println(veteriano.getApellido());
        System.out.println(veteriano2.getNombre());
        System.out.println(veteriano2.getApellido());
veteriano.setApellido("Pereyra");
        System.out.println(veteriano.getApellido());
        veteriano.saludo();
    }

}
