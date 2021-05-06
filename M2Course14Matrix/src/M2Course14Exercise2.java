import java.util.Scanner;

public class M2Course14Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrixA = new int[3][3];
		int[][] matrixB = new int[3][3];
		
		
		for(int i = 0; i < matrixA.length; i++) {
			for(int j = 0; j < matrixA[i].length; j++) {
				matrixA[i][j] = sc.nextInt();
				matrixB[i][j] = sc.nextInt();
				
			}
		}
		checkSum(matrixA, matrixB);
		checkDif(matrixA, matrixB);
		checkMultiplicationWithANumber(matrixA, matrixB);
		checkMultiplication(matrixA, matrixB);
		

		sc.close();
		
	}
	
	public static void checkSum(int[][] matrixA, int[][] matrixB) {
		int[][] matrixC = new int[3][3];
		for(int i = 0; i < matrixC.length; i++) {
			for(int j = 0; j < matrixC[i].length; j ++) {
				matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		
		for(int i = 0; i < matrixC.length; i++) {
			for (int j = 0; j < matrixC[i].length; j++) {
				System.out.print(matrixC[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void checkDif(int[][] matrixA, int[][] matrixB) {
		int[][] matrixC = new int[3][3];
		for(int i = 0; i < matrixC.length; i++) {
			for(int j = 0; j < matrixC[i].length; j ++) {
				matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
			}
		}
		
		for(int i = 0; i < matrixC.length; i++) {
			for (int j = 0; j < matrixC[i].length; j++) {
				System.out.print(matrixC[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void checkMultiplicationWithANumber(int[][] matrixA, int[][] matrixB) {
		int[][] matrixC = new int[3][3];
		int number = 5;
		
		for(int i = 0; i < matrixC.length; i++) {
			for(int j = 0; j < matrixC[i].length; j ++) {
				matrixC[i][j] = matrixA[i][j] * number;
			}
		}
		
		for(int i = 0; i < matrixC.length; i++) {
			for (int j = 0; j < matrixC[i].length; j++) {
				System.out.print(matrixC[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void checkMultiplication(int[][] matrixA, int[][] matrixB) {
		int[][] matrixC = new int[3][3];
		for(int i = 0; i < matrixA.length; i++) {
			for(int j = 0; j < matrixB[i].length; j ++) {
				matrixC[i][j] = 0;
				for(int k = 0; k < matrixC.length; k++) {
					matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}
		
		for(int i = 0; i < matrixC.length; i++) {
			for (int j = 0; j < matrixC[i].length; j++) {
				System.out.print(matrixC[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
}
