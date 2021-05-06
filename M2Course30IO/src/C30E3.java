import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C30E3 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> myList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please insert the number of words");
		int numberOfWords = sc.nextInt();
		
		System.out.println("Please insert the words.");
		for(int i = 0; i < numberOfWords; i++) {
			myList.add(sc.next());
		}
		
		String toWrite = shortestNumber(myList) + "\n" 
				+ longestNumber(myList) + "\n"
				+ firstLastWord(myList, "first") + "\n"
				+ firstLastWord(myList, "last") + "\n"
				+ numberOfWords;
		
		try(FileWriter result = new FileWriter("result.txt")){
			result.write(toWrite);
		}
		
		sc.close();
	}
	
	public static String shortestNumber(ArrayList<String> myList) {
		int min = Integer.MAX_VALUE;
		String minWord = "";
		for(String s: myList) {
			if(s.length() < min) {
				min = s.length();
				minWord = s;
			}
		}
		return minWord;
	}
	
	public static String longestNumber(ArrayList<String> myList) {
		int max = Integer.MIN_VALUE;
		String maxWord = "";
		
		for(String s: myList) {
			if(s.length() > max) {
				max = s.length();
				maxWord = s;
			}
		}
		
		return maxWord;
	}
	
	public static String firstLastWord(ArrayList<String> myList, String myWord) {
		Collections.sort(myList);
		
		if(myWord.equals("first")) {
			return myList.get(0);
		} else if (myWord.equals("last")) {
			return myList.get(myList.size()-1);
		}
		
		return null;
	}
}
