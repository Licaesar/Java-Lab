package atividade_for;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner aqui = new Scanner(System.in);

        int N = aqui.nextInt();

        for(int i = 0; i < N; i++ ){
            double x = aqui.nextInt();
            double y = aqui.nextInt();

            if (x / y == 0) {
                System.out.println("Divisão impossivel");
            } else {
                System.out.println("Resultado: " + x/y);
            }
            
        }

        aqui.close();
    }
}
