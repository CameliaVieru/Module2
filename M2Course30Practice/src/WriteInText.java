import java.io.FileWriter;
import java.io.IOException;

public class WriteInText {
	private static String[] getData() {
		String[] cities =  {"London", "Bucharest", "Berlin", "Moscow"};
		return cities;
	}

	public static void main(String[] args) throws IOException {
		String[] dataToWrite = getData();

		FileWriter outputFile = null;
		try {
		  outputFile = new FileWriter("output.txt");
		 
		  for (String city : dataToWrite) {
		    outputFile.write(city + " ");
		  }
		} catch (IOException e) {
		  System.out.println("Something wrong has happened...");
		  e.printStackTrace();
		} finally {
		  try {
		    if (outputFile != null) {
		      outputFile.close();
		    }
		  } catch (IOException e) {
		    System.out.println("Exception raised when attempting to close the file");
		    e.printStackTrace();
		  }
		}
	}
}
