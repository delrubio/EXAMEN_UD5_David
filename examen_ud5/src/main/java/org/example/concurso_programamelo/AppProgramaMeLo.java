package org.example.concurso_programamelo;

public class AppProgramaMeLo {
    public static void main(String[] args) {

        Concurso iesmutxamel = new Concurso();
        System.out.println(iesmutxamel);
        Equipo maquinitas = new Equipo("Los maquinitas");
        System.out.println(maquinitas);
        iesmutxamel.agregarEquipo(maquinitas);
        System.out.println(iesmutxamel);
        maquinitas.ficharMiembros("Daniel","Lucas");
        System.out.println(maquinitas);
        maquinitas.ficharMiembros("Carla","Eros","Lucía");
        Equipo triunfitos = new Equipo("Los triunfitos");
        iesmutxamel.agregarEquipo(triunfitos);
        triunfitos.ficharMiembros("Juan","Patri","Alexia");
        System.out.println(triunfitos);
        maquinitas.setProblemas_resueltos(2);
        maquinitas.calcularPuntos();
        triunfitos.setProblemas_resueltos(3);
        triunfitos.calcularPuntos();
        //a)
        iesmutxamel.imprimirEquipos();
        //b)
        iesmutxamel.ganadorConcurso();

    }
}
