package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentDriver {
	public static void main(String[] args) {
		Student s = new Student(101, "Santhosh");
		
		//to convert java object to byte code, 1st create a file
		
		try(FileOutputStream fs = new FileOutputStream("D:Folder1/student.ser"); 
				ObjectOutputStream os = new ObjectOutputStream(fs)){
			os.writeObject(s);
			System.out.println("Object serialized successfully");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		// pass the file ref for ObjecrOutputStream
		
		
		//passing the student obj ref for ObjecrOutputStream
		//inorder to get converted to Byte Code format
		
	}
}
