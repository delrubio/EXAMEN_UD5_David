package org.example.concurso_programamelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Equipo {

    public static int puntos = 0;//quiero llevar una cuenta de los puntos del equipo
    public static int problemas = 0;//llevar un contador del numero de problemas del equipo
    public static final int valorPuntuacion = 10;//el valor de multiplicacion que valen los problemas resueltos

    private String nombreEquipo;
    private ArrayList<String> listaMiembros;
    private int problemas_resueltos;
    private int puntuacion;

    public Equipo(String nombreEquipo){
        this.nombreEquipo=nombreEquipo;
        listaMiembros=new ArrayList<>();
        problemas_resueltos=problemas;
        puntuacion=puntos;
    }

    public static int getPuntos() {
        return puntos;
    }

    public static void setPuntos(int puntos) {
        Equipo.puntos = puntos;
    }

    public static int getProblemas() {
        return problemas;
    }

    public static void setProblemas(int problemas) {
        Equipo.problemas = problemas;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<String> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(ArrayList<String> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public int getProblemas_resueltos() {
        return problemas_resueltos;
    }

    public void setProblemas_resueltos(int problemas_resueltos) {
        this.problemas_resueltos = problemas_resueltos;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void ficharMiembros(String... nombre){
        listaMiembros.addAll(Arrays.asList(nombre));//añado a la lista los miembros
        if (listaMiembros.size()>4){//controlo que no sean más de 4, si son mas de 4 entra en el bucle
            System.out.println("No se pueden añadir " + (listaMiembros.size()-4) + ((listaMiembros.size()-4) == 1 ? " miembro más" : " miembros más"));//doy la explicación y calculo cuantos miembros sobran
            listaMiembros.removeAll(Arrays.asList(nombre));//retiro los miembros recien añadidos a la lista
        }
    }

    public int calcularPuntos(){
        puntuacion=problemas_resueltos*valorPuntuacion;
        System.out.println("El equipo " + getNombreEquipo() + " ha finalizado con " + puntuacion + (puntuacion == 1 ? " punto" : " puntos"));
        return puntuacion;//he calculado la puntuación con una ternalia para si en un futuro se cambia la puntuación pueda ser singular
    }

    @Override
    public String toString(){
        return "Equipo [ nombre : " + getNombreEquipo() + ", listaMiembros : " + listaMiembros + ", problemas_resultos : " + getProblemas_resueltos() + ", puntuacion : " + getPuntuacion();
    }

}
