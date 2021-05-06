
public class Course1E4Second {
	public static void main(String[] args) {
		int left = 1;
		int right = 5000;
		
		for(int i = left; i < right; i++) {
			int possibleFriend = findAmicableNumber(i);
			if(possibleFriend != -1) {
				System.out.println(i + " - " + possibleFriend);
			}
		}
	}
	
	public static int sum(int number) {
		int sum = 0;
		for(int i = 1; i < number/2; i++) {
			if(number % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static int findAmicableNumber(int number) {
		int possibleFriend = sum(number);
		int sumDivsOfPF = sum(possibleFriend);
		
		if(sumDivsOfPF == number && possibleFriend != number) {
			return possibleFriend;
		}
		
		return -1;
	}
	
}
