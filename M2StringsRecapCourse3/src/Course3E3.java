import java.util.Scanner;

public class Course3E3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myString = sc.next();
		int myNumber = convertStringToNumber(myString);
		System.out.println(myNumber);
		sc.close();
	}
	
	public static int convertStringToNumber(String numberStr) {
		  char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		  int numValue = 0;
		  
		  for (int i=0; i<numberStr.length(); i++) {
			  for (int j=0; j<digits.length; j++) {
				  if (numberStr.charAt(i) == digits[j]) {
					  numValue = numValue * 10 + j;
				  }
			  }
		  }
		  
		  return numValue;
	}
}
