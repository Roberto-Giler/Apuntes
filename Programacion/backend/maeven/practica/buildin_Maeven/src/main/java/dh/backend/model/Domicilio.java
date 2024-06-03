package dh.backend.model;

public class Domicilio {
    private int id;
    private String numero;
    private String calle;
    private String localidad;
    private String provincia;

    public Domicilio(String numero, String calle, String localidad, String provincia) {
        this.numero = numero;
        this.calle = calle;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public Domicilio(int id, String numero, String calle, String localidad, String provincia) {
        this.id = id;
        this.numero = numero;
        this.calle = calle;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public String getCalle() {
        return calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", calle='" + calle + '\'' +
                ", localidad='" + localidad + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }

}
