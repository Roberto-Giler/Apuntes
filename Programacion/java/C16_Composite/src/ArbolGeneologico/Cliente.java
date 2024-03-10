package ArbolGeneologico;

public class Cliente {
    public static void main(String[] args) {
        Persona persona1= new Persona("Jorgito");
        Persona persona2= new Persona("Juan");
        Persona persona3= new Persona("Pedro");
        Persona persona4= new Persona("Nicolas");
        Persona persona5= new Persona("Marcelo");
        GrupoFamiliar familia1= new GrupoFamiliar("Familia Gonzalez");
        familia1.agregarFamiliar(persona1);
        familia1.agregarFamiliar(persona2);
        GrupoFamiliar familia2= new GrupoFamiliar("Familia Tubaro");
        familia2.agregarFamiliar(persona3);
        familia2.agregarFamiliar(persona4);
        familia2.agregarFamiliar(persona5);
        GrupoFamiliar raiz= new GrupoFamiliar("Arbol de Familiares");
        raiz.agregarFamiliar(familia1);
        raiz.agregarFamiliar(familia2);

        ArbolGeneologico arbol= new ArbolGeneologico(raiz);
        arbol.arbolGeneologico();

    }

}
