package org.example;

import Clases.Estudiante;

public class Main {
    public static void main(String[] args) {


        Estudiante estudiante =new Estudiante();


        estudiante.setNombre("juiciosos");
        estudiante.setNotapromedio(15);


        String nombre =estudiante.getNombre();
        System.out.println(nombre);

        double nota =estudiante.getNotapromedio();
        System.out.println(nota);
    }
}
