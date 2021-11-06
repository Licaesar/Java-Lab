package atividades;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, pec1, pec2;
        double val1, val2, result;
        

        System.out.println("Digite o número do 1º produto: ");
        cod1 = sc.nextInt();
        System.out.println("Digite o númeor do 2º produto: ");
        cod2 = sc.nextInt();
        System.out.println("Digite quantas peças do 1º produto serão compradas: ");
        pec1 = sc.nextInt();
        System.out.println("Digite quantas peças do 2º produto serão compradas: ");
        pec2 = sc.nextInt();
        System.out.println("Digite o valor do 1º produto: ");
        val1 = sc.nextDouble();
        System.out.println("Digite o valor do 2º produto: ");
        val2 = sc.nextDouble();

        result = (pec1*val1 + pec2*val2);

        System.out.printf("O valor a ser pago foi de R$%.2f%n", result);
        System.out.println(cod1 + cod2);

        sc.close();
    }
}
