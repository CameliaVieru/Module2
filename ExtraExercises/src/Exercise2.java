import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add number: ");
		int number = sc.nextInt();
		int counter=0;
		int base = 10;
		int perfect = 1;
		int number2 = number;
		
		while(number>0) {
			number /= 10;
			counter++;
		}
		System.out.println("Number of digits: " + counter);
		
		for(int i = 0; i< counter; i++) {
			perfect *=base;
		}
		
		int complementary = perfect - number2;
		System.out.println("The number's complementary = " + complementary);
		sc.close();
	}
}
