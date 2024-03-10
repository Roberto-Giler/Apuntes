package presencial;

import java.sql.Date;

public abstract class Impresora {
    //atributos
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    protected Integer hojasDisponibles;
    private Double porcentajeTinta;

    public Impresora(String modelo, String tipoConexion, Date fechaFabricacion, Integer hojasDisponibles, Double porcentajeTinta) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeTinta = porcentajeTinta;
    }
    //METODOS ABSTRACTOS
    public abstract boolean tienePapel();
    public abstract boolean necesitaTinta();
    public abstract String imprimir();

    public Double getPorcentajeTinta() {
        return porcentajeTinta;
    }

    public void setPorcentajeTinta(Double porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }
}
