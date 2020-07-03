package com.company;

import java.util.Scanner;

public class conversor_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        double formula = 2.54;
        double formula2 =  1.609;
        double resultado;
        System.out.println("Presiona 1 si quieres convertir de cm a pulgadas");
        System.out.println("Presiona 2 si quieres convertir de pulgadas a cm");
        System.out.println("Presiona 3 si quieres convertir de km a millas");
        System.out.println("Presiona 4 si quieres convertir de millas a km");
        double entrada = input.nextInt();

        if (entrada == 1) {
            System.out.println("¿que numero quieres convertir?");
            double cm = number.nextInt();
            resultado = cm / formula;
            System.out.println(cm + "cm son " + resultado + " pulgadas.");


        } else {
            if (entrada == 2) {
                System.out.println("¿Que valor quieres convertir?");
                double pul = number.nextInt();
                resultado = pul * formula;
                System.out.println(pul + "pulgadas son " + resultado + " cm.");
            } else {
                if (entrada == 3) {
                    System.out.println("¿Que valor quieres convertir?");
                    double km = number.nextInt();
                    resultado = km / formula2;
                    System.out.println(km + "km son " + resultado + " millas.");
                } else {
                    if (entrada == 4) {
                        System.out.println("¿Que valor quieres convertir?");
                        double millas = number.nextInt();
                        resultado = millas * formula2;
                        System.out.println(millas + "millas son " + resultado + " km.");
                    }
                }
            }

        }
        System.out.println("¡Gracias!");
    }
}
