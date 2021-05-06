import java.util.Scanner;

public class Course3E4 {
	
	public static boolean isWordIdenticalToKey(String word, String key) {
		int i;
		int minLength;
		if(word.length() > key.length()) {
			minLength = key.length();
		}else {
			minLength = word.length();
		}
		  
		for (i = 0; i < minLength; ++i) {
			if (word.charAt(i) == key.charAt(i)) 
				return true;
		}
			  
		return false;
	}
	
	public static String [] lettersMatchIgnoreCase(String[] array, String key) {
		int counter = 0;
		  for (int i = 0; i < array.length; i++) {
		    String currentWord = array[i];
		    
		    if (isWordIdenticalToKey(currentWord, key)) {
		      counter++;
		    }
		  }
		  String[] result = new String[counter];
		  counter = 0;
		  
		  for (int i = 0; i < array.length; i++) {
		    String currentWord = array[i];
		    
		    if (isWordIdenticalToKey(currentWord, key)) {
		      result[counter++] = currentWord;
		    }
		  }
		  
		  return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add the key word: ");
		String key = sc.next();
		System.out.println("Add the Array length: ");
		String[] myArray = new String[sc.nextInt()];
		
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = sc.next();
		}
		
		String[] secondArray = lettersMatchIgnoreCase(myArray, key);
		
		for(int i = 0; i < secondArray.length; i++) {
			System.out.println(secondArray[i]);
		}
		
		sc.close();
		
		}
		
	
}
	

