package com.cajero;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        menu();
    }


    public static void menu(){
        Scanner geting = new Scanner(System.in);
        double fondos = 1200;
        boolean loopmenu = false;

        System.out.print("Escriba su nombre: ");
        String nombre = geting.next();
        System.out.print("Escriba su apellido: ");
        String apellido = geting.next();



        while (!loopmenu){
            String menu = """
                Bienbenido al banco virtual...
                1. revisar saldo
                2. hacer deposito
                3. hacer retiro
                4. salir
                escriba la opciondeseada:""";
            System.out.println(menu);
            int opcion = geting.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Su saldo actual es: "+fondos);
                    break;
                case 2:
                    System.out.println("ingrese el saldo a depositar: ");
                    double saldoDeposito = geting.nextDouble();
                    fondos = fondos + saldoDeposito;
                    System.out.println("su saldo fue depositado correctamente");
                    break;
                case 3:
                    System.out.println("ingrese el saldo a retirar: ");
                    double saldoRetiro = geting.nextDouble();
                    fondos = fondos - saldoRetiro;
                    System.out.println("su saldo fue retirado correctamente");

                    break;
                case 4:
                    loopmenu = true;
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("la opcion, no es valida...");
                    break;
            }
        }
    }
}
