package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;

public class Example {
	
	public static void main(String[] args) throws IOException {
		
		//creating a file
		File f2 = new File("hello123.txt");
		
		try {
			f2.createNewFile();
		}
		catch(IOException e) {
			System.out.println("File not created");
		}
		
		try(FileWriter f3 = new FileWriter("hello123.txt")){
			f3.write("Hello 123 file");
		}
		catch(IOException e) {
			System.out.println("File writing is unsuccessfull");
		}
		
		//create a folder
//		try {
			File f1 = new File("D:Folder1");
			f1.mkdir();
//		}
//		catch(IOException e) {
//			System.out.println("Folder not created");
//		}
			
			
			//create a folder (method 1)
			File f4 = new File(f1, "Handling");
			f4.mkdirs();
			
			//create a folder (method 2)
			File f5 = new File("D:Folder1/Handling/File Handling");
			f5.mkdirs();
		
			//creating files inside sub directory
			
			File f6 = new File(f5, "sample.java");
			try {
				f6.createNewFile();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
			try {
				FileWriter f7 = new FileWriter(f6);
				f7.write("Hello java file");
				f7.close();
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
			File f8 = new File(f5, "sample1.java");
			try {
				f8.createNewFile();
			}
			catch(IOException e) {
				System.out.println("File not created");
			}
			
			FileWriter f9 = new FileWriter(f8);
			try{
				f9.write("This is re writing in file again");
				f9.close();
			}
			catch(IOException e) {
				System.out.println("File not found");
			}
			
			
			System.out.println(f1.getAbsolutePath());
			System.out.println(f2.getAbsolutePath());
			System.out.println(f4.getAbsolutePath());
			System.out.println(f5.getAbsolutePath());
			System.out.println(f6.getAbsolutePath());
			System.out.println(f8.getAbsolutePath());
			
			System.out.println(f5.listFiles());
			
			File[] folder = f5.listFiles();
			if(folder != null) {
				for(File f10 : folder) {
					System.out.println(f10.getName());
				}
			}
			
			
			// rewriting a line using FileWriter
			FileWriter f9a = new FileWriter(f8, true);
			try {
				f9a.write("\n");
				f9a.write("This is the second line in a file");
//				f9a.close();
			}
			catch(IOException e) {
				System.out.println("File not found");
			}
			
			
//			BufferedWriter (it is used to add new lines in a file, rather than using \n)
			BufferedWriter bw = new BufferedWriter(f9a);
			bw.newLine();
			bw.newLine();
			bw.write("tHis is 3rd line");
			bw.newLine();
			bw.write("tHis is 4th line");
			bw.newLine();
			bw.close();
			f9a.close();
			
			
			FileWriter f11 = new FileWriter(f8, true);
			f11.append("This is 5th line");
			f11.write("Hello, this overrides");
			f11.append("This is 6th line");
			f11.write("hehehheklsdjsjka");
			f11.close();
		
			
			// reading data from file
			FileReader fr = new FileReader(f8);
			int read;
			while((read=fr.read()) != -1) {
				System.out.println((char) read);
			}
			System.out.println(fr);
			fr.close();
	}
}
