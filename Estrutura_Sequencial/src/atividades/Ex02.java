package atividades;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double raio, area, pi = 3.14159;
        
        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();
        area = (pi*(raio*raio));
        System.out.printf("A área do circulo é  de: %.4f%n", area);
        
        sc.close();
    }
}
