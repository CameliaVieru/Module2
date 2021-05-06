import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static void main(String[] args) {
		
	}
	public List<String> fizzBuzz(int n) {
		ArrayList<String> myList = new ArrayList<>(n);


		for(int i = 1; i <= n; i++){
			if(i % 3 == 0 && i % 5 == 0){
				myList.add("FizzBuzz");
			} else if(i % 3 == 0){
				myList.add("Fizz");
			} else if(i % 5 == 0){
				myList.add("Buzz");
			} else{
				myList.add(String.valueOf(i));

			}
		}

		return myList;

	}
}
