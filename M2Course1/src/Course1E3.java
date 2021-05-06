import java.util.Scanner;

public class Course1E3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add your number: ");
		int number = sc.nextInt();
		System.out.println("The biggest multiple of five smaller or equal to " + number + " is " + biggestMultipleOfFive(number));
		System.out.println("The smallest multiple of five bigger or equal to " + number + " is " + smallMultipleOfFive(number));
		sc.close();
		
	}
	
	// a)
	public static int biggestMultipleOfFive(int n) {
		int aux = n % 5;
		return n - aux;
	}
	
	//b)
	
	public static int smallMultipleOfFive(int n) {
		int aux = n % 5;
		int aux2;
		if(aux != 0) {
			aux2 = 5 - aux;
			return n + aux2;
		}
		return n;
		
	}
}
