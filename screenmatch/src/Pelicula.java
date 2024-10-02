public class Pelicula {
    String nombre;
    int fechaLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeLaevaluaciones;
    int totalDeEvaluaciones;


    public void MuestraFichaTecnica(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
    }

    public void  evaaluar(double nota){
        sumaDeLaevaluaciones += nota;
        totalDeEvaluaciones ++;
    }

    public double calcularMedia(){
        return sumaDeLaevaluaciones/totalDeEvaluaciones;
    }
}
