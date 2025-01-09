package com.screenmatchs.screen.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo() {

        List<String> nombres = Arrays.asList("Juanin", "pablo", "maria", "martha");
        // se imprime la lista
        nombres.stream().limit(2).sorted().filter(n -> n.startsWith("J")).map(n -> n.toUpperCase()).forEach(System.out::println);
    }
}
