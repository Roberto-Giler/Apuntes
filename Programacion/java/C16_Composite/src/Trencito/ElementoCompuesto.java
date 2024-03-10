package Trencito;

import java.util.ArrayList;
import java.util.List;

public class ElementoCompuesto extends Figura{
    private List<Figura> elementos= new ArrayList<>();
    public void agregarFigura(Figura figura){
        elementos.add(figura);

    }
    @Override
    public double calcularArea() {
        double areaTotal=0;
        for (Figura elemento : elementos) {
            //por cada figura que llegue de esta lista llamada elementos, vamos a hacer su respectivo
            //calculo de area y eso sumarlo a una variable que acumula todos los valores provistos.
            areaTotal+= elemento.calcularArea();

        }
        return areaTotal;
    }
}
