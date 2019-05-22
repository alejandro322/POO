package co.com.beans;

public class Instructor extends Persona {
    private int id;
    private String nombres;
    private String apellidos;
    private String telefono;


    public Instructor (int idI, String nombresI, String apellidosI, String telefonoI){
        this.id = idI;
        this.nombres = nombresI;
        this.apellidos = apellidosI;
        this.telefono = telefonoI;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

