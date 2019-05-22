package co.com.beans;

import java.util.ArrayList;

public class Ficha {
    private int id;
    private ProgramaFormacion nombrePrograma;
    private String tipo;
    private ArrayList<Aprendiz> aprendices;

    public Ficha() {
        aprendices = new ArrayList<>();
        Aprendiz juan = new Aprendiz();
        juan.setId(10);
        aprendices.add(juan);
        id = 20;
        tipo = "Técnica";
    }

    public ArrayList<Aprendiz> getListaAprendices() {
        return aprendices;
    }

    public void setListaAprendices(ArrayList<Aprendiz> listaaprendices) {
        this.aprendices = listaaprendices;
    }
}
