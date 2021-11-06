package atividades;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quantos;
        double c1 = 4.0, c2 = 4.5, c3 = 5.0, c4 = 2.0, c5 = 1.5;

        System.out.println("Digite o código do produto:");
        codigo = sc.nextInt();

        System.out.println("Digite a quantidade de produtos:");
        quantos = sc.nextInt();

        

        if (codigo == 1) {
            System.out.println("O preço foi de: " + c1*quantos);
        } 
        if (codigo == 2) {
            System.out.println("O preço foi de: " + c2*quantos);
        } 
        if (codigo == 3) {
            System.out.println("O preço foi de: " + c3*quantos);
        } 
        if (codigo == 4) {
            System.out.println("O preço foi de: " + c4*quantos);
        } 
        if (codigo == 5) {
            System.out.println("O preço foi de: R$" + c5*quantos);
        } 
            
        

        sc.close();
    }
}
