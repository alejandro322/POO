package co.com.beans;

import java.util.ArrayList;
import java.util.HashMap;

public class Coordinador {
    private int id;
    private String nombres;
    private String apellidos;
    private String telefono;
    private ArrayList<Instructor> ins1;
    private HashMap<String, Instructor> ins2;

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
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

    public ArrayList<Instructor> getIns1() {
        return this.ins1;
    }

    public void setIns1(ArrayList<Instructor> ins1) {
        this.ins1 = ins1;
    }

    public HashMap<String, Instructor> getIns2() {
        return this.ins2;
    }

    public void setIns2(HashMap<String, Instructor> ins2) {
        this.ins2 = ins2;
    }
}
