package atividades;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0 ) {
            
            System.out.println("São multiplos");

        } else {
            System.out.println("Não são multiplos");
        }


        sc.close();
    }
}
