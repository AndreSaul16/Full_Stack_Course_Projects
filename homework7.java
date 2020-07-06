package homework;

import java.util.Scanner;

//Escriba un programa Java deducir si un año es biciesto

public class homework7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dime el año");
		int año = input.nextInt();
		
		if (año % 100 != 0) {
				System.out.print("Tu año es biciesto");
			} else {
				if (año % 400 == 0 ) {
					System.out.print("Tu año es biciesto");
				} else {
					System.out.print("Tu año no es biciesto");
				}
			}
			
	}
}
