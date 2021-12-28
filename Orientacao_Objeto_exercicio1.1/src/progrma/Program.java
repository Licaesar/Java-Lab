package progrma;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		
		double width, height;
		
		System.out.println("Type a width valor: ");
		width = input.nextDouble();
		System.out.println("Type a heigth valor: ");
		height = input.nextDouble();
		
		Rectangle retangulo = new Rectangle(width, height);
		
		System.out.println("Area: " + retangulo.Area());
		System.out.println("Perimeter: " + retangulo.Perimeter());
		System.out.println("Diagonal: " + retangulo.Diagonal());
		
		input.close();
	}

}
