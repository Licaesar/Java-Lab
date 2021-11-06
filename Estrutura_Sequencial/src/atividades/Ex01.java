package atividades;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        
        System.out.println("Type a number: ");
        x = sc.nextInt();
        System.out.println("Type another number:");
        y = sc.nextInt();

        System.out.println("The sum is: " + (x+y));

        sc.close();
    }
}
