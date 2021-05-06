import java.util.Scanner;

public class Course1E1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add a number: ");
		int number = sc.nextInt();
		System.out.println("The complementary number of " + number + " is " + complementaryNumber(number));
		sc.close();
	}
	
	public static int complementaryNumber(int number) {
		
		int smallRoundNr = 1;
		while(smallRoundNr < number) {
			smallRoundNr *= 10;
		}
		
		int complementaryNumber = smallRoundNr - number;
		return complementaryNumber;
		
	}
}
