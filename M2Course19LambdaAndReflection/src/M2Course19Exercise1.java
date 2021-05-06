import java.util.Scanner;

public class M2Course19Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IOperator sum = (a,b) -> a + b;
		IOperator dif = (a,b) -> a - b;
		IOperator multiplication = (a,b) -> a*b;
		IOperator div = (a,b) -> a / b;
		IOperator mod = (a,b) -> a % b;
		
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		
		System.out.println(sum.operation(firstNumber, secondNumber));
		System.out.println(dif.operation(firstNumber, secondNumber));
		System.out.println(multiplication.operation(firstNumber, secondNumber));
		System.out.println(div.operation(firstNumber, secondNumber));
		System.out.println(mod.operation(firstNumber, secondNumber));
		
		sc.close();
	}
}
