import java.util.Scanner;

public class M2Course19Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		IVerifyProperty evenNumber = a -> {
			if(a % 2 == 0) {
				return true;
			}
			return false;
		};
		
		IVerifyProperty negative = a -> {
			if(a < 0) {
				return true;
			}
			return false;
		};
		
		IVerifyProperty isZero = a -> {
			if(a == 0) {
				return true;
			}
			return false;
		};
		
		System.out.println(evenNumber.hasPropery(number));
		System.out.println(negative.hasPropery(number));
		System.out.println(isZero.hasPropery(number));
		
		sc.close();
	}
}
