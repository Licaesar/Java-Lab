package Program;

import java.util.Scanner;

import Entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dec, quantity;
		
		Product produto;
		produto = new Product();
		
		System.out.println("Digite o nome do produto: ");
		produto.name = sc.next();
		System.out.println("Digite o preço do produto: ");
		produto.price = sc.nextDouble();
		System.out.println("Digite a quantidade do produto: ");
		produto.quantity = sc.nextInt();
		System.out.println(produto);
		
		System.out.println("Você deseja adicionar ou remover a quantidade do produto?");
		System.out.println("1 - ADICIONAR");
		System.out.println("2 - REMOVER");
		System.out.println("3 - To de boas");
		dec = sc.nextInt();
		
			if (dec == 1) {
				System.out.println("Digite a quantidade que desaja adicionar: ");
				quantity = sc.nextInt();
				produto.addProducts(quantity);
				System.out.println("Updated data: " + produto);
			}
			if (dec == 2) {
				System.out.println("Digite a quantidade que desaja remover: ");
				quantity = sc.nextInt();
				produto.removeProducts(quantity);
				System.out.println("Updated data: " + produto);
			}
			if (dec >= 3) {
				System.out.println("Mó paz");
			}
			
		
		
		sc.close();

	}

}
