package atividades_while;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(); 
        int y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            }
            if (x < 0 && y > 0) {
                System.out.println("Segundo");
            }
            if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            }
            if (x > 0 && y < 0) {
                System.out.println("Quarto");
            }

            x = sc.nextInt();
			y = sc.nextInt();
        }
        

        sc.close();
    }
}
