package homework;

import java.util.Scanner;

//Escriba un programa Java que mantenga un número del usuario 
//y genere un número entero entre 1 y 7 y muestre el nombre del día de la semana.

public class homework5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("dime un numero y te dire a que dia de la semana correspode");
	
		int number = input.nextInt();

		if (number == 1) {
			System.out.print("Lunes");
		} else {
			if (number == 2) {
				System.out.print("Martes");
			} else {
				if (number == 3) {
					System.out.print("Miercoles");
				} else {
					if (number == 4) {
						System.out.print("Jueves");
					} else {
						if (number == 5) {
							System.out.print("Viernes");	
						} else {
							if (number == 6) {
								System.out.print("Sabado");
							} else {
								if (number == 7) {
									System.out.print("Domingo");
								} else {
									System.out.print("¿que haces? ¡solo hay 7 dias en la semana!");
								}
							}
					}
				}
			}
		}

	}

}
}

