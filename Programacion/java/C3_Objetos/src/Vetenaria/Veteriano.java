package Vetenaria;

public class Veteriano {//SIEMPRE DEPENDE DEL MODELO DE NEGOCIOS
    //las partes de una clase
    //Nombre de la clase
    //atributos o caracteristicas
    //acciones o metodos que realizan
    private String nombre;
    private String apellido;
    private Integer matricula;
    public Veteriano(String nombre, String apellido, Integer matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }


    public void saludo(){
        System.out.println("Hola, buenos dias");
    }
}
