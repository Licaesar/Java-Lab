package program;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Evil Bank");
		System.out.println("Enter accont number: ");
		int number = input.nextInt();
		System.out.println("Enter accont holder: ");
		String holder = input.next();
		
		System.out.println("Is there na initial deposit (y/n)?");
		char response = input.next().charAt(0);
		double balance;
		
		if (response == 'y') {
			System.out.print("Enter initial deposit: ");
			balance = input.nextDouble();
		} else {
			balance = 0;
		}
		
		Account account = new Account(number, holder, balance);
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		double deposit = input.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		double withdraw = input.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		input.close();
	}

}
