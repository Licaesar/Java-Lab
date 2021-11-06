package atividades_while;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha, alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("Qual combustivel é de sua preferência:");
        System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
        escolha = sc.nextInt();

        while (escolha != 4) {

            if (escolha == 1) {
                ++alcool;
            }
            if (escolha == 2) {
                ++gasolina;
            }
            if (escolha == 3) {
                ++diesel;
            }

            System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
            escolha = sc.nextInt();
        }

        System.out.println("Relatório:");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
