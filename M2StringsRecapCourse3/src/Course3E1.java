import java.util.Scanner;

public class Course3E1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myString = sc.nextLine();
		char maximAppearances = max(myString);
		min(myString);
		System.out.println("The most frecvent letter is: " + maximAppearances);
		sc.close();
		
	}
	
	//a)
	public static String removeBlankSpaces(String myString) {
		StringBuilder stringBuilder = new StringBuilder(myString);
		String result;
		for(int i = 0; i < stringBuilder.length(); i++) {
			if(!Character.isLetter(stringBuilder.charAt(i))) {
				stringBuilder.deleteCharAt(i);
				i--;
			}
		}
		result = stringBuilder.toString();
		return result;
	}
	public static char max(String myString) {
		String myString2 = removeBlankSpaces(myString);
		String newString = myString2.toLowerCase();
		char[] myArray = newString.toCharArray();
		int max = 0;
		char maxChar = myArray[0];
		
		for(int i = 0; i < myArray.length; i++) {
			int counter = 0;
			for(int j = i+1; j < myArray.length; j++) {
				if(myArray[i] == myArray[j]) {
					counter++;
				}
			}
			if(counter > max) {
				max = counter;
				maxChar = myArray[i];
			}
		}
		return maxChar;
	}
	
	//b)
	
	public static void min(String myString) {
		String newString = myString.toLowerCase();
		int minValue = newString.length();
		char minChar = newString.charAt(0);

		for (int i = 0; i < newString.length(); i++) {
			int counter = 0;
			for (int j = 0; j < newString.length(); j++) {
				if (newString.charAt(i) == newString.charAt(j)) {
					counter++;
				}
			}
			if (minValue > counter) {
				 minValue = counter;
				minChar = newString.charAt(i);
			}
		}

		System.out.println("The least frecvent letter is: " + minChar);
	}
}
