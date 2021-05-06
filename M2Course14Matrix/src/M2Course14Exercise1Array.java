import java.util.Scanner;

public class M2Course14Exercise1Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matrixDimension = sc.nextInt();
		int mainDiagValue = sc.nextInt();
		int sndDiagValue = sc.nextInt();
		int centreValue = sc.nextInt();
		int leftValue = sc.nextInt();
		int upValue = sc.nextInt();
		int rightValue = sc.nextInt();
		int bottomValue = sc.nextInt();
		
		int[][] numbers = new int[matrixDimension][matrixDimension];
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				if(i == j) {
					if(i == (numbers.length - 1)/ 2 && j == (numbers.length - 1)/ 2) {
						numbers[i][j] = centreValue;
					} else {
						numbers[i][j] = mainDiagValue;
					}
					
				}
				else if(i + j == numbers.length-1) {
					numbers[i][j] = sndDiagValue;
				}
				else if(i > j && i + j < numbers.length - 1) {
					numbers[i][j] = leftValue;
				}
				else if(i < j && i + j < numbers.length - 1) {
					numbers[i][j] = upValue;
				}
				else if(i < j && i + j > numbers.length - 1) {
					numbers[i][j] = rightValue;
				}
				else if(i > j && i + j > numbers.length - 1) {
					numbers[i][j] = bottomValue;
				}
			}
		}
		
		for(int i=0; i<numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
