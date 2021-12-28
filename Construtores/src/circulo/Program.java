package circulo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double diametro = input.nextDouble();
		
		Circulo bolinha = new Circulo(diametro);
		
		System.out.println(bolinha);
		
		
		input.close();

	}

}
