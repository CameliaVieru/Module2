//1.1. Scrie un algoritm care citeste de la tastatura 2 numere naturale: o baza (i.e. b) si un exponent maxim (i.e. e). Programul va afisa toate puterile bazei, de la b0 la be (i.e. b0, b1, b2, …, be).

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		int x = 1;
		System.out.print(x + " ");
		
		for(int i = 0; i < exponent; i++) {
			x *= base;			
			System.out.print(x + " ");
		}
		sc.close();
	}
}
