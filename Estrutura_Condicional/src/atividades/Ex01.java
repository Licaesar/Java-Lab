package atividades;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um número:");
        num = sc.nextInt();

        if (num >= 0) {

            System.out.println("POSITIVO");
            
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
