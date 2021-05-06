
public class UglyNumbers {
	public static void main(String[] args) {
		int number = 0;
		System.out.println(isUgly(number));
	}
	
	public static boolean isUgly(int number) {
		if(number <= 0) {
			return false;
		}
		while(number != 1) {
			if(number% 2 == 0) {
				number /= 2;
			} else if(number % 3 == 0) {
				number /= 3;
			} else if(number % 5 == 0) {
				number /= 5;
			} else {
				
				return false;
			}
		}
		
		if (number == 1) {
			return true;
		}
		return false;
	}
}
