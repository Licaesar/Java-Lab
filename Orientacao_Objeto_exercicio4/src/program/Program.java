package program;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter convertor;
		convertor = new CurrencyConverter();
		
		System.out.print("What is the dollar price ? ");
		convertor.dolarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		convertor.dolarBuy = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", convertor.converter());
		
		
		sc.close();

	}

}
