package presencial;

import java.sql.Date;

public class ImpresoraEpson extends Impresora{
    public ImpresoraEpson(String modelo, String tipoConexion, Date fechaFabricacion, Integer hojasDisponibles, Double porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public boolean tienePapel() {
        return hojasDisponibles>0;
    }

    @Override
    public boolean necesitaTinta() {
        return getPorcentajeTinta()<=5.0; //diciendo cuando sea menor que 5% va a dar false
    }

    @Override
    public String imprimir() {
        if (tienePapel() && !necesitaTinta()) {
            //puede imprimir
            return "Imprimiendo en la Impresora Epson";
        } else {
            return  "verifique los niveles de tinta o papel";
        }
    }

}
