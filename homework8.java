package homework;

import java.util.Scanner;

//Escriba un programa en Java para ingresar 5 números desde el teclado y encuentre su suma y promedio

public class homework8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		Scanner input5 = new Scanner(System.in);
		
		System.out.print("Dime un numero");
		float number1 = input.nextFloat();
		
		System.out.print("Dime un numero");
		float number2 = input2.nextFloat();
		
		System.out.print("Dime un numero");
		float number3 = input3.nextFloat();
		
		System.out.print("Dime un numero");
		float number4 = input4.nextFloat();
		
		System.out.print("Dime un numero");
		float number5 = input5.nextFloat();
		
		double resultado = number1 + number2 + number3 + number4 + number5;
		double resultado2 = resultado / 5;
		System.out.print("La suma total de tus numeros es " + resultado + " y la media total de tus numeros es " + resultado2);
	}
}
