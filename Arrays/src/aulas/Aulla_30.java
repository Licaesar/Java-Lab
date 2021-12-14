package aulas;

import java.util.Iterator;
import java.util.Scanner;

public class Aulla_30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Escreva a quantidade de alunos: ");
		int numAlunos = input.nextInt();

		double[] notasAlunos = new double[numAlunos];

		for (int i = 0; i < numAlunos; i++) {
			System.out.println("Digite a nota dos alunos: "+ (i+1) + "º aluno");
			notasAlunos[i] = input.nextDouble();

		}
		
		for (int i = 0; i < numAlunos; i++) {
			System.out.println("-> " + notasAlunos[i]);

		}

		System.out.println();

		input.close();

	}

}
