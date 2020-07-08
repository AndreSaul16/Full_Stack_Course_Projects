package random_arrays_andMore;
import java.util.Random;

public class otraclass {
	public static void main(String[] args) {
		Random random = new Random();
		int numbers[] = new int[50];
		int x=0,y=0,k=0;
		for (x = 0; x<numbers.length; x++) {
			numbers[x]=random.nextInt(50);
			
			for (int j = 0; j < numbers.length; j++) {
				y = numbers[x] + j;
				k= y / numbers.length;
			}
		}
		System.out.print("La suma total de tus numeros es " + y + " y la media total de tus numeros es " + k);
	}
}	
