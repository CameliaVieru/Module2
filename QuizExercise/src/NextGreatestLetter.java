
public class NextGreatestLetter {
	public static void main(String[] args) {
		char[] chari = {'c', 'f', 'j'};
		char key = 'c';
		
		System.out.println(nextGreatestLetter(chari, key));
	}
		
		 public static char nextGreatestLetter(char[] letters, char target) {
			 int left = 0;
			int right = letters.length-1;
			
			while(left < right) {
				int middle = (left + right)/2;
				if(target == letters[middle]) {
					return letters[middle + 1];
				} 
				else if(target >= letters[middle]) {
					left = middle + 1;
				}
				
				else if(target < letters[middle]) {
					right = middle - 1;
				}
			}
			if(letters[left] == letters.length) {
				return letters[0];
			}
			return letters[left];
		   
		
	}
}
