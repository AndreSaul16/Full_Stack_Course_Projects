package homework;

import java.util.Scanner;

public class homework9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("¿Que numero quieres calcular?");
		
		double number = input.nextDouble();
		double resultado = Math.pow(number, 3);
		System.out.print("El cuadrado del numero " + number + " es " + resultado);
	}
}
