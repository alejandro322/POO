package co.com.beans;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;


public class ProgramaFormacion {
    private int codigo;
    private String nombre;
    private String formacion;
    private ArrayList<ProgramaFormacion> programaFormacion;

    public ProgramaFormacion(){
        programaFormacion = new ArrayList<>();
        ProgramaFormacion multimedia = new ProgramaFormacion();
        multimedia.setCodigo(11);
        programaFormacion.add(multimedia);
        codigo = 22;
        nombre = "Multimedia";
        formacion = "Tecnica";
    }

    public int getCodigo() {
        return codigo;
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

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public ArrayList<ProgramaFormacion> getProgramaFormacion() {
        return programaFormacion;
    }

    public void setProgramaFormacion(ArrayList<ProgramaFormacion> programaFormacion) {
        this.programaFormacion = programaFormacion;
    }
}
