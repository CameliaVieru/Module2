import java.util.Arrays;
import java.util.Scanner;

public class Course2E4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] array = new double[sc.nextInt()];
		
		for(int i = 0; i < array.length; i ++) {
			array[i] = sc.nextDouble();
		}
		
		bubbleSortUp(array);
		System.out.println(Arrays.toString(array));
		
		bubbleSortDown(array);
		System.out.println(Arrays.toString(array));

		sc.close();
	}
	
	public static double[] bubbleSortUp(double[] array) {
		boolean swapElements;  
		while (true) {
			swapElements = false;
		    for (int i = 0; i < array.length - 1; i++) {
		    	if (array[i] > (array[i + 1])) {
		    		double aux = array[i];
		    		array[i] = array[i + 1];
		    		array[i + 1] = aux;
		        
		    		swapElements = true;
		    	}
		    }
		    
		    if (!swapElements) {
		    	break;
		    }
		}
		  
		return array;
	}
	
	public static double[] bubbleSortDown(double[] array) {
		boolean swapElements;  
		while (true) {
			swapElements = false;
		    for (int i = array.length-1; i >= 1; i--) {
		    	if (array[i] > (array[i - 1])) {
		    		double aux = array[i];
		    		array[i] = array[i - 1];
		    		array[i - 1] = aux;
		        
		    		swapElements = true;
		    	}
		    }
		    
		    if (!swapElements) {
		    	break;
		    }
		}
		  
		return array;
	}
}
