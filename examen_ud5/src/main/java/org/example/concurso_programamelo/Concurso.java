package org.example.concurso_programamelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Concurso {

    public static final String sedeDefault = "MUTXAMEL";//defino la variable final como MUTXAMIEL por si alguna vez se cambia
    public static int numEquipos = 0;//numero de equipos

    LocalDate fechaActual = LocalDate.now();//cojo la fecha actual porque no recuerdo como perirsela al usuario
    private String sede;
    private LocalDate fecha;
    private ArrayList<Equipo> listaEquipos;

    public Concurso(){
        sede=sedeDefault;//la sede es la default de la variable final
        setFecha();
        listaEquipos = new ArrayList<Equipo>();
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha() {
        this.fecha = fechaActual;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void agregarEquipo(Equipo equipo){
        if (listaEquipos.size() <= 20){//compruebo que haya espacio para poder introduir 1 equipo más
            listaEquipos.add(equipo);
            numEquipos++;//contador del número de equipos
        }
    }

    public void imprimirEquipos(){
        System.out.println("Numero de quipos: " + numEquipos);
        for (Equipo equ : listaEquipos){
            System.out.println("Equipo " + equ.getNombreEquipo() + "[ " + equ.getListaMiembros() + " ]"); //datos del equipo
        }
    }

    public void ganadorConcurso(){
        int puntosGanador = 0;
        String nombreGanador = "";

        for (Equipo equ : listaEquipos){
            if (equ.getPuntuacion() > puntosGanador){
                puntosGanador=equ.getPuntuacion();//el mayor se queda
                nombreGanador=equ.getNombreEquipo();//el mayor se queda
            }
        }

        System.out.println("El equipo ganador ha sido : " + nombreGanador + "con : " + puntosGanador + (puntosGanador == 1 ? " punto" : " puntos"));
    }

    @Override
    public String toString(){
        return "Concurso [ sede : " + sede + ", fecha : " + getFecha() + ", listaEquipos : " + listaEquipos;
    }

}
