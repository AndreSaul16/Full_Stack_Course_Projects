package homework;

import java.util.Scanner;

//Escriba un programa Java que lea en dos números de punto flotante 
//y pruebe si son iguales hasta tres decimales.

public class homework6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.print("dime un numero");
		float number = input.nextFloat();
		
		System.out.print("dime otro numero");
		float number2 = input2.nextFloat();
		
		if (number == number2) {
			System.out.print("Son iguales");
		} else {
			if (number != number2) {
				System.out.print("Son diferentes");
			}
					 
		}
	}
}

