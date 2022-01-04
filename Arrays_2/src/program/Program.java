package program;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int alunos = input.nextInt();
		
		Rent[] vect = new Rent[10];
		
		for(int i = 0; i < alunos; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			String name = input.next();
			System.out.print("Email: ");
			String email = input.next();
			System.out.print("Room: ");
			int room = input.nextInt();
			
			vect[room] = new Rent(name, email, room);
			
			System.out.println("");
		
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].toString());
			}
		}
		

		input.close();

	}

}
