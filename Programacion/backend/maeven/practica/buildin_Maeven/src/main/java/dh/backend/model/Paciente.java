package dh.backend.model;

import java.time.LocalDate;

public class Paciente {
    private  int id;
    private String Apellido;
    private String Nombre;
    private String DNI;
    private LocalDate FechaIngreso;
    private Domicilio domicilio;

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", Apellido='" + Apellido + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", FechaIngreso=" + FechaIngreso +
                ", domicilio=" + domicilio +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public int getId() {
        return id;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public LocalDate getFechaIngreso() {
        return FechaIngreso;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public Paciente(String apellido, String nombre, String DNI, LocalDate fechaIngreso, Domicilio domicilio) {
        Apellido = apellido;
        Nombre = nombre;
        this.DNI = DNI;
        FechaIngreso = fechaIngreso;
        this.domicilio = domicilio;
    }

    public Paciente(int id, String apellido, String nombre, String DNI, LocalDate fechaIngreso, Domicilio domicilio) {
        this.id = id;
        Apellido = apellido;
        Nombre = nombre;
        this.DNI = DNI;
        FechaIngreso = fechaIngreso;
        this.domicilio = domicilio;
    }
}
