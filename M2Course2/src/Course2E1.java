
public class Course2E1 {
	
	
	public static void main(String[] args) {
		System.out.println(returnReverse(1345));
		System.out.print(returnReverseB(1345));
	}
	
	//a)
	public static int returnReverse(int n) {
		if(n < 10) {
			return n;
		}
		
		String lastDigit = String.valueOf(n % 10);
		return Integer.parseInt(lastDigit + returnReverse(n/10));
	}
	
	//b)
	public static int returnReverseB(int n) {
		if(n < 10) {
			return n;
		}
		String lastDigit = "";
		String reverse = "";
		while(n > 0) {
			lastDigit = String.valueOf(n % 10);
			reverse += lastDigit;
			n /= 10;
		}
		return Integer.parseInt(reverse);
	}
}

