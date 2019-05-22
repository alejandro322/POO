package co.com.beans;

public class Aprendiz extends Persona{
    private int id;
    private String nombres;
    private String apellidos;
    private String telefono;

    public Aprendiz() {
    }

    public Aprendiz(int idA, String nombresA, String apellidosA, String telefonoA){
        this.id = idA;
        this.nombres = nombresA;
        this.apellidos = apellidosA;
        this.telefono = telefonoA;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int idA) {
        this.id = idA;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres( String nombreA) {
        this.nombres = nombreA;
    }

    public String getApellidos() {
        return  this.apellidos;
    }

    public void setApellidos( String apellidosA){
        this.apellidos = apellidosA;
    }

    public String getTelefono() {
        return  this.telefono;
    }

    public void setTelefono(String telefonoA){
        this.telefono = telefonoA;
    }

}

