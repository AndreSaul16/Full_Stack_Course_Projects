package random_arrays_andMore;

import java.util.Random;

public class martes_7_7_20 {

	public static void main(String[] args) {
		//Random random = new Random();
		int y=0;
		int x;
		int numbers[] = new int[500];
		
		
		for (x = 0; x<numbers.length; x++) {
			numbers[x]=y;
			y = y + 1;
			System.out.println("numbers[" + x + "] = " + numbers[x] );
		}
	}

}
