package praticas;

import java.util.Locale;
import java.util.Scanner;

public class Pratica1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x;

        x = sc.nextDouble();

        System.out.println("Você digitou o valor: " + x);

        sc.close();
    }
}
