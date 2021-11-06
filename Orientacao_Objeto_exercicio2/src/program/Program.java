package program;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee proletario;
		proletario = new Employee();
		
		System.out.println("Type a employee data: ");
		System.out.println("Name: ");
		proletario.name = sc.next();
		System.out.println("Gross salary: ");
		proletario.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		proletario.tax = sc.nextDouble();
		
		System.out.println(proletario);
		
		System.out.println("Which percentage to increase salary ? ");
		double percentage = sc.nextDouble();
		proletario.IncraseSalaty(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + proletario);
		
		sc.close();

	}

}
