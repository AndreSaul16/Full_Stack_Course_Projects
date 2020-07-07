package bucles_for;

public class lunes_06_07_20 {
	public static void main(String[] args) {
	
		System.out.println(" " + 1 + " " + 2+ " "  + 3+ " "  + 4+ " "  + 5+ " "  + 6+ " "  + 7+ " "  + 8+ " "  + 9+ " "  + 10+ " " );
		for (int filas = 0; filas <= 10; filas++) {
			System.out.print("  " + filas);
			System.out.println(" ");
			
				for (int columnas = 0; columnas <= 10; columnas++) {
					System.out.print(" " + columnas * filas);
					
								
			}
		}
	}
}
