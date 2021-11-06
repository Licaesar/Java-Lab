package atividades;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int num, horas;
        double grana;

        System.out.println("Número do funcionário: ");
        num = sc.nextInt();
        System.out.println("Número de hora trabalhadas: ");
        horas = sc.nextInt();
        System.out.println("Valor ganho por hora trabalhada: ");
        grana = sc.nextDouble();
        System.out.println("Número do funcionário: "+ num);
        System.out.println("Salário: " + (horas*grana));

        sc.close();
    }
}
