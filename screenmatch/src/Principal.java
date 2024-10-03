import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula();
        p1.setNombre( "Pelicula de terror") ;
        p1.setFechaLanzamiento(2001);
        p1.setDuracionEnMinutos(120);
        p1.MuestraFichaTecnica();
        p1.evaaluar(10);

        System.out.println(p1.getSumaDeLaevaluaciones());
        System.out.println(p1.getTotalDeEvaluaciones());
        System.out.println(p1.calcularMedia());


        System.out.println();
        Pelicula p2 = new Pelicula();
        p2.setNombre("Pelicula de comedia");
        p2.setFechaLanzamiento(2009);
        p2.setDuracionEnMinutos(160);
        p2.MuestraFichaTecnica();
        p2.evaaluar(10);
        System.out.println(p2.getSumaDeLaevaluaciones());
        System.out.println(p2.getTotalDeEvaluaciones());
        System.out.println(p2.calcularMedia());

    }
}
