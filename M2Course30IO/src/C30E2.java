
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C30E2 {
	public static void main(String[] args) throws IOException {
		int counter = 0;
		try(Scanner sc = new Scanner(new FileReader("./src/Numbers1.txt")); Scanner sc2 = new Scanner(new FileReader("./src/Numbers2.txt"))){
			while(sc.hasNext()) {
				counter++;
				sc.next();
			}
			
			while(sc2.hasNext()) {
				counter++;
				sc2.next();
			}
		}
		
		int[] finalList = new int[counter];
		int it = 0;
		
		try(Scanner sc = new Scanner(new FileReader("./src/Numbers1.txt")); Scanner sc2 = new Scanner(new FileReader("./src/Numbers2.txt"))) {
			while(sc.hasNext()) {
				finalList[it] = sc.nextInt();
				it++;
			}
			
			while(sc2.hasNext()) {
				finalList[it] = sc2.nextInt();
				it++;
			}
		}
		
		finalList = sort(finalList);
		String numbers3 = "";
		
		for(int i = 0; i < finalList.length; i++) {
			numbers3 += finalList[i] + " ";
		}
		
		try(FileWriter fileFinal = new FileWriter(".Numbers3.txt")){
				fileFinal.write(numbers3);
		}
		
	}
	
	public static int[] sort(int[] list) {
		for (int i = 0; i < list.length; i++){
			int minim = i;
			for (int j = i+1; j < list.length; j++) {
				if (list[j] < list[minim]) {
					minim = j;
				}
			}
			int temp = list[minim];
			list[minim] = list[i];
			list[i] = temp;
		}
		
		return list;
	}

}
