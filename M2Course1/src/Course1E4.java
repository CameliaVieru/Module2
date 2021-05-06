public class Course1E4 {
	public static void main(String[] args) {
		int lowerLimit = 1;
		int upperLimit = 10000;
		
		for(int i = lowerLimit; i <= upperLimit; i ++) {
			for(int j = lowerLimit; j <= upperLimit; j++) {
				if(checkNumbers(i, j) && i != j) {
					System.out.println("The following numbers are amicable numbers: " + i + " - " + j);
				}
				
			}
		}		      
		
	}
	
	public static boolean checkNumbers(int number1, int number2) {
		int result = 0;
		int result2 = 0;
		
		for(int i = 1; i < number1; i++) {
			if(number1 % i == 0) {
				result += i;
			}
		}

		for(int i = 1; i < number2; i++) {
			if(number2 % i == 0) {
				result2 += i;
			}
		}
		
		if(result2 == number1 && result == number2) {
			return true;
		}
		
		return false;
	}
	
}

