import com.aluracursos.screenmach.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

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




        Serie serie1 = new Serie();
        serie1.setNombre("Serie1");
        serie1.setFechaLanzamiento(2001);
        serie1.setTemporadas(1);
        serie1.setMinutosPorCapitulo(50);
        serie1.setEpisodiosPorTemporada(10);
        serie1.MuestraFichaTecnica();
        System.out.println(serie1.getDuracionEnMinutos());

        Pelicula p3 = new Pelicula();
        p3.setNombre("Matrix");
        p3.setFechaLanzamiento(2001);
        p3.setDuracionEnMinutos(160);

        System.out.println("------------------");
        CalculadoraDeTiempo cal = new CalculadoraDeTiempo();
        cal.incluye(p1);
        cal.incluye(serie1);
        cal.incluye(p3);
        System.out.println(cal.getTiempoTotal());





    }
}
