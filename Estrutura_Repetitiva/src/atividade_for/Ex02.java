package atividade_for;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int dentro = 0; 
        int fora = 0;

        for (int X = 0; X < n; X++) {
            int i = sc.nextInt();
            if (i >= 10 && i <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println(dentro + " in");
        System.out.println(fora + " ut");

        sc.close();
    }
}
