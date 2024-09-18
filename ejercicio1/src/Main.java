public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.println("Pelicula: Matrix");
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double nota = 8.2;
        double media = (8.2+6.0+9.0)/3;
        System.out.println("Este es la media: "+media);

        String sinopsis = """
                la
                mejor
                playa """+ fechaDeLanzamiento;
        System.out.print(sinopsis);

        String contrasena= "12345";
        if (contrasena.equals("12345")) {
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("Contraseña incorrecta.");
        }

        int clasificacion =(int) media/2;
    }
}
