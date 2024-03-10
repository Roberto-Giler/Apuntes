package ArbolGeneologico;

public class ArbolGeneologico {
    private ComponenteGeneologico arbol;

    public ArbolGeneologico(ComponenteGeneologico arbol) {
        this.arbol = arbol;
    }
    public void arbolGeneologico(){
        arbol.mostrar();
    }
}
