package homework;

/*Escriba un programa Java que lea un n�mero de punto flotante e imprima "cero" si el n�mero es cero.
 *De lo contrario, imprima "positivo" o "negativo". 
 *Agregue "peque�o" si el valor absoluto del n�mero es menor que 1, o "grande" si excede 1,000,000. 
*/

import java.util.Scanner;

public class homework4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("dime un numero");
	
		float number = input.nextFloat();

		if (number == 0) {
			System.out.print("El numero " + number + " es positivo y es un numero peque�o");
		} else {
			if (number < 0) {
				System.out.print("El numero " + number + " es negativo y es un numero peque�o");
			} else {
				if (number > 999.999) {
					System.out.print("El numero " + number + " es positivo y es un numero grande");
				} else {
					System.out.print("El numero " + number + " es postivo y es un numero peque�o");
				}
			}
		}
	
	}
}

