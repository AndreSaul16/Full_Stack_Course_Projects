package homework;

//Escriba un programa Java para obtener un número del usuario e imprima si es positivo o negativo.

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dime un numero y te dire si es positivo o negativo");
		int value = input.nextInt();
		    
		//int contador = 0;
		    
	        	if (value < 0) {
	            	System.out.println("tu numero es negativo");
		        	} else {
		        		if (value > 0) {
		        			System.out.println("Tu numero es positivo");
		        	}
		        	
		        		System.out.print("Gracias");	
		        		
			
		
		}

	}

}
