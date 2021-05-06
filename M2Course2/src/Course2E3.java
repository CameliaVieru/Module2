import java.util.Scanner;

public class Course2E3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[sc.nextInt()];
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int[] secondArray = moveZero(array);
		
		for(int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + " ");
		}
		sc.close();
	}
	
	public static int[] moveZero(int[] array) {
		int counter = array.length-1;
		
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != 0) {
				array[counter] = array[i];
				counter--;
			}
		}
		
		while(counter >= 0) {
			array[counter] = 0;
			counter--;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		return array;
	}
}
