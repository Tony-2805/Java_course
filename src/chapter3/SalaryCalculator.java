package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]) {
        int baseSalary = 1000;
        int bonus = 250;
        int salarioFinal = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas ventas hizo esta semana?");
        int cantVentas = sc.nextInt();
        sc.close();


        if (cantVentas >= 10) { // es mejor no tener numeros que no se sepa que son sin contexto, sino una variable
            salarioFinal = baseSalary + bonus;
        }
        else { salarioFinal = baseSalary; }

        System.out.println("El salario semanal final es: $" + salarioFinal);
    }
}
