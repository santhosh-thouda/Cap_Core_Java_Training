package FileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentDriver1 {
	public static void main(String[] args) {
		Student1 s1 = new Student1(101, "Santhu");
		String filePath = "D:/Folder1/Student1.txt";
		
		try {
			// serialization
//			FileOutputStream fos = new FileOutputStream(filePath);
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(s1);
//			
//			oos.close();
//			fos.close();
//			
//			System.out.println("Object saved in file ");
			
			
			// de serialization
			FileInputStream fis = new FileInputStream("filePath");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student ss = (Student)ois.readObject();
			
			System.out.println(ss.id);
			System.out.println(ss.name);
			ois.close();
			fis.close();
			
			System.out.println("Object Read successfully");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
