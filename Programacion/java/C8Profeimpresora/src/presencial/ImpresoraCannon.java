package presencial;

import java.sql.Date;

public class ImpresoraCannon extends Impresora {

    public ImpresoraCannon(String modelo, String tipoConexion, Date fechaFabricacion, Integer hojasDisponibles, Double porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public boolean tienePapel() {
        return hojasDisponibles > 5;
    }

    @Override
    public boolean necesitaTinta() {
        return getPorcentajeTinta() <= 20;
    }

    @Override
    public String imprimir() {
        if (tienePapel() && !necesitaTinta()) {
            //puede imprimir
            return "Imprimiendo en la Impresora Epson";
        } else {
            return "verifique los niveles de tinta o papel";
        }
    }
}