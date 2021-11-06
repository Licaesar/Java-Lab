package atividades;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, dif;

        System.out.println("Digite 4 números: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        dif = a * b - c * d;

        System.out.println("A diferença foi de: " + dif);

        sc.close();
    }
}
