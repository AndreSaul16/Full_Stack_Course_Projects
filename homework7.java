package homework;

import java.util.Scanner;

//Escriba un programa Java deducir si un a�o es biciesto

public class homework7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dime el a�o");
		int a�o = input.nextInt();
		
		if (a�o % 100 != 0) {
				System.out.print("Tu a�o es biciesto");
			} else {
				if (a�o % 400 == 0 ) {
					System.out.print("Tu a�o es biciesto");
				} else {
					System.out.print("Tu a�o no es biciesto");
				}
			}
			
	}
}
