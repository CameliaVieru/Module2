
public class CountOccurrences {
	
	public static int countOccurrences(int[] array, int key) {
		int counter = 0;
		int left = 0;
		int right = array.length - 1;
		
		while(left < right) {
			int middle = (left + right)/2;
	
			if(key == array[middle]) {
				int aux = middle;
				while(aux < array.length && array[aux] == key) {
					counter++;
					aux++;
				}
				aux = middle - 1;
				
				while(aux >= 0 && array[aux] == key) {
					counter ++;
					aux--;
				}
				return counter;
				
			} else if(key < array[middle]) {
				right = middle - 1;	
				
			} else if(key > array[middle]) {
				left = middle + 1;

			}
		
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("Checking input...");

		int[] array = {0, 2, 3, 5, 5, 5, 8, 11, 11, 101};

		int rez = countOccurrences(array, 11);
		System.out.println("You got: " + rez + " Correct: " + 2);
	}

}
