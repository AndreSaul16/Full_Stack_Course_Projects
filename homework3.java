package homework;

//Tome tres números del usuario e imprima el mayor número.

import java.util.Scanner;

public class homework3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("introduce tu primer numero");
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("introduce tu segundo numero");
		
		Scanner input3 = new Scanner(System.in);
		System.out.print("introduce tu tercer numero");
		
		int number1 = input.nextInt();
		int number2 = input2.nextInt();
		int number3 = input3.nextInt();
		
		if (number1 > number2 && number1 > number3) {
			System.out.print(number1 + " es el numero mayor");			
		} else {
			if (number2 > number1 && number2 > number3) {
				System.out.print(number2 + " es el numero mayor");
			} else {
				if (number3 > number1 && number3 > number2) {
					System.out.print(number3 + " es el numero mayor");	
				}
			}
		}
	}
}
