package program;

import java.util.Iterator;

public class For_each {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Carlos", "João"};
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-----------------------------"); 
		// For each é util para desempacotar um vertor
				
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
