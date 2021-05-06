package Polymorphism;

public class Main {
	public static void main(String[] args) {
		int firstInt = 5;
		int secondInt = 8;
		int thirdInt = 19;
		
		double firstDouble = 13.65;
		double secondDouble = 54.3;
		double thirdDouble = 31.31;
		
		//Dynamic polymorphism
		PolymorphismDynamic2 object = new PolymorphismDynamic2();
		object.infoToPrint();
		
		System.out.println(sum(firstInt, secondInt));
		System.out.println(sum(firstInt, secondInt, thirdInt));
		System.out.println(sum(firstDouble, secondDouble));
		System.out.println(sum(firstDouble, secondDouble, thirdDouble));
		
	}
	//Static polymorphism
	public static int sum(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public static double sum(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public static int sum(int firstNumber, int secondNumber, int thirdNumber) {
		return firstNumber + secondNumber + thirdNumber;
	}
	
	public static double sum(double firstNumber, double secondNumber, double thirdNumber) {
		return firstNumber + secondNumber + thirdNumber;
	}
}
