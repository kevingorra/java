package Clases;

public class Estudiante {


    private String nombre;
    private double notapromedio;


    public Estudiante() {
    }

    public Estudiante(String nombre, double notapromedio) {
        this.nombre = nombre;
        this.notapromedio = notapromedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotapromedio() {
        return notapromedio;
    }

    public void setNotapromedio(double notapromedio) {

        if (notapromedio>5){
            System.out.println("nota Invalida");
        }else {
            this.notapromedio=notapromedio;
        }

    }
}
