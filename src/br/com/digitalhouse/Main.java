package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        System.out.println("Hello World");
        Integer umNumeroA;
        Double umNumeroB;
        String umaCadeiaDeTexto;

        umNumeroA = 10;
        umNumeroB = 20.0d;
        umaCadeiaDeTexto = "Cadeia de texto do Tairo";

        System.out.println(umNumeroA);
        System.out.println(umNumeroB);
        System.out.println(umaCadeiaDeTexto);

        System.out.println("Soma de A + B = " + (umNumeroA+umNumeroB));
        System.out.println("A Subtração A - B =" + (umNumeroA-umNumeroB));


        Scanner scanner = new Scanner(System.in);


        umNumeroA = scanner.nextInt();
        System.out.println("Recebi: " +umNumeroA);



    }
}

