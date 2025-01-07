package com.screenmatchs.screen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

import static java.lang.Integer.parseInt;

@SpringBootApplication
public class ScreenApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Holi");
        int min = 1; // Límite inferior
        int max = 31; // Límite superior

        Random random = new Random();
        int numeroAleatorio = random.nextInt((max - min) + 1) + min;

        System.out.println("Número aleatorio: " + numeroAleatorio);
    }
}
