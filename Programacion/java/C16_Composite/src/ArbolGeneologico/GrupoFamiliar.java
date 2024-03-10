package ArbolGeneologico;

import java.util.ArrayList;
import java.util.List;

public class GrupoFamiliar implements ComponenteGeneologico{
    private String nombre;
    private List<ComponenteGeneologico> familiares= new ArrayList<>();

    public GrupoFamiliar(String nombre) {
        this.nombre = nombre;
    }
    public void agregarFamiliar(ComponenteGeneologico familiar){
        familiares.add(familiar);
    }
    @Override
    public void mostrar() {
        System.out.println("Grupo familiar: "+nombre);
        for (ComponenteGeneologico familiar : familiares) {
            familiar.mostrar();

        }

    }
}
