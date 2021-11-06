package atividade_for;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
   public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double num1, num2, num3;

        for (int i = 0 ; i < N; i++) {
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            num3 = sc.nextDouble();

            double media = (num1*2 + num2*3 + num3*5)/10;

            System.out.printf("Média: %.2f%n", media);
        }

       sc.close();
   } 
}
