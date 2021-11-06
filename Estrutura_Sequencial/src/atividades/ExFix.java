package atividades;

import java.util.Locale;

public class ExFix {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Declaração de variáveis

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // Terminal

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("Measue with eight decima places: %.8f%n", measure);
        System.out.printf("Rouded with threee decimal places: %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);



    }
}
