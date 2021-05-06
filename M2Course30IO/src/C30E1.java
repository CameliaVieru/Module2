
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C30E1 {
	public static void main(String[] args) throws IOException {

		String test = "";
		try(Scanner sc = new Scanner (new FileReader("./src/output.txt"))) {
			while(sc.hasNextLine()) {
				test += sc.nextLine();
				test += "\n";
			}
		}
		
		test = test.replace("fotbal", "volei");
		
		try(FileWriter replaceWord = new FileWriter("./src/output.txt")){
			replaceWord.write(test);
		}
	}
}
