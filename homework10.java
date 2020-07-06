package homework;

import java.util.Scanner;

//tabla
public class homework10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Que tabla quieres ver");
		int tabla = input.nextInt();
		int contador = 0;
		int resultado;
				
		while (contador <= 20) {
			resultado = tabla * contador;
					System.out.println(tabla + " por " + contador + " es igual a " + resultado);
			contador = contador + 1;
		}
		
	}

}
