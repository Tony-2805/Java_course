package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){
        /*
        System.out.println("Ingresar cantidad de horas que trabajan los empleados.");
        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt();

        System.out.println("Ingresar pago por horas trabajada.");
        double montoPorHora= sc.nextDouble();

        double sueldo = (montoPorHora * horas);

        System.out.println("El sueldo total es " +sueldo);
         */

        //HW
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un adjetivo");
        String adjetivo = sc.next();

        System.out.println("Ingresar una estación del año");
        String estacion = sc.next();

        System.out.println("Ingresar cantidad de cafe");
        int cantCafe=sc.nextInt();

        System.out.println("En un " +adjetivo +" día de " +estacion +", me tomo por lo memos " +cantCafe + " tazas de cafe.");
    }

}
