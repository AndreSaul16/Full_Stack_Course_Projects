package homework;

//Escriba un programa Java para resolver ecuaciones cuadráticas

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("¿Que numero quieres calcular?");
		
		double number = input.nextDouble();
	
		double raiz = Math.sqrt(number);
		
		System.out.print("la raiz cuadrada de tu numero es " + raiz);
		

	}

}
