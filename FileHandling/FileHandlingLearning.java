package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingLearning {
	public static void main(String[] args) {
		File myFile = new File("hello.txt");
		
		try {
			myFile.createNewFile();			
		}
		catch(IOException e) {
			System.out.println("Unable to create a file");
			e.printStackTrace();
		}
		
		try (FileWriter fileWriter = new FileWriter("hello.txt")) {
			fileWriter.write("Hello World!");
			fileWriter.close();
		}
		catch(IOException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		
	}
}
