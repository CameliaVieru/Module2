import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C30E1b {
	public static void main(String[] args) throws IOException {
		String text = "";
		try(Scanner sc = new Scanner(new FileReader("TextInput.txt"));
				FileWriter newText = new FileWriter("TextOutput.txt")){
			while(sc.hasNext()) {
				text = sc.nextLine();
				
				if(text.contains("fotbal")) {
					text = text.replace("fotbal", "volei");
				}
				
				newText.write(text);
				newText.write("\n");
			}
		}
		
	}
	
}
