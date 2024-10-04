package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre;
    private int fechaLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLaevaluaciones;
    private int totalDeEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void MuestraFichaTecnica(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
    }


    public void  evaaluar(double nota){
        sumaDeLaevaluaciones += nota;
        totalDeEvaluaciones ++;
    }

    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }
    public double getSumaDeLaevaluaciones(){
        return sumaDeLaevaluaciones;
    }

    public double calcularMedia(){
        return sumaDeLaevaluaciones/totalDeEvaluaciones;
    }
}
