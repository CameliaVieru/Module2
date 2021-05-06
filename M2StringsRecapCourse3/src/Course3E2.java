import java.util.Arrays;

public class Course3E2 {
	public static void main(String[] args) {
		String myString = "Fairy tales!";
		String key = "rail, Safety!";
		
		System.out.println(checkIfAnagrams(myString, key));
	}
	
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
	
	public static char[] sortArray(char[] myArray) {
		for(int i = 0; i < myArray.length; i++ ) {
			for(int j = i+1; j < myArray.length; j++) {
	        	 if(myArray[i] > myArray[j]) {
	        		 char aux = myArray[i];
	        		 myArray[i] = myArray[j];
	        		 myArray[j] = aux;
	               }
			}
		}
		return myArray;
	}
	
	
	public static boolean checkIfAnagrams(String word, String key) {
		String wordLettersOnly = removeBlankSpaces(word);
		String keyLettersOnly = removeBlankSpaces(key);
		
		String newStringWord = wordLettersOnly.toLowerCase();
		String newStringKey = keyLettersOnly.toLowerCase();
		
		char[] wordArray = newStringWord.toCharArray();
		char[] keyArray = newStringKey.toCharArray();
		
		wordArray = sortArray(wordArray);
		keyArray = sortArray(keyArray);
		
		System.out.println(Arrays.toString(wordArray) + " and " + Arrays.toString(keyArray));
		
		if(Arrays.equals(wordArray, keyArray)) {
			return true;
		}
		
		return false;
	}
}
