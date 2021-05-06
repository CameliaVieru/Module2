import java.util.ArrayList;
import java.util.Scanner;

public class M2Course14Exercise1ArrayList {
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
		
		ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>(matrixDimension);
		
		for (int i = 0; i < matrixDimension; i++) {
			ArrayList<Integer > newRow = new ArrayList<Integer>(matrixDimension);
			for (int j = 0; j < matrixDimension; j++) {
				newRow.add(0);
			}
			numbers.add(newRow);
		}
		
		for(int i = 0; i < numbers.size(); i++) {
			for (int j = 0; j < numbers.get(i).size(); j++) {
				if(i == j) {
					if(i == (numbers.size() - 1)/ 2 && j == (numbers.size() - 1)/ 2) {
						numbers.get(i).set(j, centreValue);
					} else {
						numbers.get(i).set(j, mainDiagValue);
					}
					
				}
				else if(i + j == numbers.size() - 1) {
					numbers.get(i).set(j, sndDiagValue);
				}
				else if(i > j && i + j < numbers.size() - 1) {
					numbers.get(i).set(j, leftValue);
				}
				else if(i < j && i + j < numbers.size() - 1) {
					numbers.get(i).set(j, upValue);
				}
				else if(i < j && i + j > numbers.size() - 1) {
					numbers.get(i).set(j, rightValue);
				}
				else if(i > j && i + j > numbers.size() - 1) {
					numbers.get(i).set(j, bottomValue);
				}
			}
		}
		for(int i = 0; i < numbers.size(); i++) {
			for (int j = 0; j < numbers.get(i).size(); j++) {
				System.out.print(numbers.get(i).get(j) + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
