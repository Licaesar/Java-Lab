package program;

import java.util.Scanner;

import entities.Studant;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Studant vagabundo;
		vagabundo = new Studant();
		
		System.out.println("Type a studant data: ");
		System.out.println("Name: ");
		vagabundo.name = sc.next();
		System.out.println("Nota do primeiro trimestre: ");
		vagabundo.trim1 = sc.nextDouble();
		System.out.println("Nota do segundo trimestre: ");
		vagabundo.trim2 = sc.nextDouble();
		System.out.println("Nota do terceiro trimestre: ");
		vagabundo.trim3 = sc.nextDouble();
		
		if (vagabundo.nota() >= 60) {
			System.out.println("Nota final: " + vagabundo.nota());
			System.out.println("APORVADO");
		} else {
			System.out.println("Nota final: " + vagabundo.nota());
			System.out.println("REPROVADO");
			System.out.println("Faltou: " + vagabundo.reprovado());

		}
		
		
		sc.close();

	}

}
