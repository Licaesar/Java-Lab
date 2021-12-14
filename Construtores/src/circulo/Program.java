package circulo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double raio = input.nextDouble();
		
		Circulo bolinha = new Circulo(raio);
		
		System.out.println(bolinha);
		
		
		input.close();

	}

}
