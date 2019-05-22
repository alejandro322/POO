package co.com.bussineslogic;
import co.com.beans.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class MainClass {
    public static void main(String[] args) {

        List<String> ejemplo = new ArrayList<String>();

        ejemplo.add("Cama");
        ejemplo.add("Alcoba");
        ejemplo.add("Baño");
        ejemplo.add("Cocina");

        System.out.println("\nManera 1:");
        for (int i = 0; i < ejemplo.size(); i++) {
            System.out.println(ejemplo.get(i));
        }

        System.out.println("\nManera 2:");
        for (String temp : ejemplo) {
            System.out.println(temp);
        }

        System.out.println("\nManera 3:");
        Iterator<String> ejem = ejemplo.iterator();
        while (ejem.hasNext()){
            System.out.println(ejem.next());
        }

        System.out.println("\nManera 4:");
        int i = 0;
        while (i < ejemplo.size()){
            System.out.println(ejemplo.get(i));
            i++;
        }

        System.out.println("\nManera 5:");
        ejemplo.forEach((temp) ->{
            System.out.println(temp);
        });

        System.out.println("\nUpperCase:");
        List<String> alphaUpper = new ArrayList<>();
        for (String s : ejemplo) {
            alphaUpper.add(s.toUpperCase());
            System.out.println(alphaUpper);
        }




        Aprendiz juan = new Aprendiz();
        juan.setId(3000);
        juan.setNombres("Juan");
        juan.setApellidos("Mejia");
        juan.setTelefono("3322345");

        Instructor jose = new Instructor(1,"Jose", "Vasquez", "3211233465");
        Instructor alejo = new Instructor(2,"Alejandro", "Garcia", "3115675435");
        Instructor charan = new Instructor(3,"Gabriela", "Mejia", "3145677898");

        Coordinador eldrin = new Coordinador();

        eldrin.setNombres("William");
        eldrin.setApellidos("Martinez");
        eldrin.setTelefono("3145654352");

        HashMap<String,Instructor> instructores = new HashMap<String, Instructor>();

        eldrin.setIns2(instructores);

        instructores.put("1", jose);
        instructores.put("2", alejo);
        instructores.put("3", charan);

        /*eldrin.getIns2().forEach((k, v) -> {
            System.out.println("Instructores del coordinador " +
                    eldrin.getNombres() + ": " +
                    v.getNombres() + " " +
                    v.getApellidos() + " " +
                    v.getTelefono());
            JOptionPane.showMessageDialog(null,"Instructores del coordinador " +
                    eldrin.getNombres() +
                    ": \n Nombre: " + v.getNombres() +
                    "\n Apellidos: " + v.getApellidos() +
                    "\n Teléfono: " + v.getTelefono());
        });*/


        Competencia uno = new Competencia(111, ": Implantar",": Implantar el proyecto funcional");
        //JOptionPane.showMessageDialog(null, "Id Juan: "+juan.getId());
        // JOptionPane.showMessageDialog(null, "Codigo "+uno.getCodigo()+"\nNombre"+uno.getNombre()+"\nDescripción"+uno.getDescripcion());
        Aprendiz Kevin = new Aprendiz(12,"Kevin","López","315232324");

        /*JOptionPane.showMessageDialog(null, "Id: "+
                                                    Kevin.getId()+ "\nNombre: "+
                                                    Kevin.getNombres()+"\nApellidos: " +
                                                    Kevin.getApellidos()+"\nTeléfono: "+
                                                    Kevin.getTelefono());+*/


        ArrayList<Aprendiz> lista  = new  ArrayList<Aprendiz>();
        lista.add(Kevin);
        lista.add(juan);

        /*Iterator<Aprendiz> it = lista.iterator();
        while (it.hasNext())
            System.out.println(it.next().getNombres());*/

        Ficha ficha = new Ficha();
        ficha.setListaAprendices(lista);
        //JOptionPane.showMessageDialog(null, ficha.getListaAprendices().get(1).getNombres());
        //JOptionPane.showMessageDialog(null, ficha.getListaAprendices().get(1).getApellidos());

        // El hashmap designa claves únicas para valores correspondientes que pueden ser utilizados en cualquier punto
        // Almacena solo referencias de objetos no se puede utilizar double o int minúscula

        // LinkedList lista doblemente enlazada para almacenar elementos. Estructura de datos de lista enlazada
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        HashMap<Integer, String> listado = new HashMap<Integer, String>();

        LinkedList<String> ejem2 = new LinkedList<String>();
        LinkedList<String> ejem1 = new LinkedList<String>();



        ejem2.add("Colobri");
        ejem2.add("Cerdo");
        ejem2.add("Mariposa");


        ejem1.add("Manzana");
        ejem1.add("Pera");
        ejem1.add("Durazno");

        /*System.out.println(ejem2);*/


        capitalCities.put("Francia", "Paris");
        capitalCities.put("Alemania", "Berlin");
        capitalCities.put("Colombia", "Medellin");

        /*System.out.println("Elementos del HashMap");
        System.out.println(capitalCities.size());
        System.out.println(capitalCities.get("Colombia"));
        System.out.println(capitalCities);*/

        listado.put(1,"Arroz");
        listado.put(2,"Papas");
        listado.put(3,"Lentejas");

        /*System.out.println(listado);
        listado.remove(2);
        capitalCities.remove("Alemania");
        System.out.println(listado);
        System.out.println(capitalCities);*/
        // keySet muetra las llaves que hay ingresadas


        /*System.out.println(listado.values());
        System.out.println(listado.keySet());
        System.out.println(capitalCities.keySet());*/
    }
}
