public class Principal {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula();
        p1.nombre = "Pelicula de terror";
        p1.fechaLanzamiento = 2001;
        p1.duracionEnMinutos = 120;
        p1.MuestraFichaTecnica();
        p1.evaaluar(10);
        p1.evaaluar(10);
        System.out.println(p1.sumaDeLaevaluaciones);
        System.out.println(p1.totalDeEvaluaciones);
        System.out.println(p1.calcularMedia());


        System.out.println();
        Pelicula p2 = new Pelicula();
        p2.nombre = "Pelicula de comedia";
        p2.fechaLanzamiento = 2009;
        p2.duracionEnMinutos = 160;
        p2.MuestraFichaTecnica();

    }
}
