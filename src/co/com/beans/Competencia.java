package co.com.beans;

public class Competencia {
    private int codigo;
    private  String nombre;
    private String descripcion;

    public  Competencia(){
    }

    public Competencia(int codigoC, String nombreC, String descripcionC){
        this.codigo = codigoC;
        this.nombre = nombreC;
        this.descripcion = descripcionC;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
