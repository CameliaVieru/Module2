import java.util.ArrayList;

public class Course5E2{
	public static void main(String[] args) {		
		String myString = "Becomming a programmer is like gaining super powers";
		frequencyCheck(myString);
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
	
	public static void frequencyCheck (String myString){
		ArrayList <Integer> frequency = new ArrayList<Integer>(26);
		for(int i = 0; i < 27; i++) {
			frequency.add(i, Integer.valueOf(0));
		}
		
		
		String myStringNoBlankSpaces = removeBlankSpaces(myString);
		String newString = myStringNoBlankSpaces.toLowerCase();
		char[] myArray = newString.toCharArray();
		
		for(int i = 0; i < myArray.length; i++) {
			int position = myArray[i] - 'a';
			frequency.set(position, frequency.get(position) + 1);
		}
		int max = 0;
		
		for(int i = 0; i < frequency.size(); i++) {
			if(frequency.get(i) > max) {
				max = frequency.get(i);
			}
		}
		
		for(int i = 0; i < frequency.size(); i++) {
			if(frequency.get(i) == max) {
				int maxCharacter = i + 'a';
				char maxCharToBePrinted = (char) maxCharacter;
				
				System.out.println("The following character " + maxCharToBePrinted + " has the maximum frequency: "+ frequency.get(i));
			}
		}
	
	}
}