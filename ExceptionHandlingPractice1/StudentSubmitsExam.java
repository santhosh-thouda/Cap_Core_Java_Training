package ExceptionHandlingPractice1;
import java.util.Scanner;
import java.io.File;

class InternetDisconnectionException extends Throwable{
	InternetDisconnectionException(String msg){
		super(msg);
	}
}

class SessionTimeoutException extends Throwable{
	SessionTimeoutException(String msg){
		super(msg);
	}
}

class FileUploadFailureException extends Throwable{
	FileUploadFailureException(String msg){
		super(msg);
	}
}



public class StudentSubmitsExam {
	static void checkInternet(boolean disconnected) throws InternetDisconnectionException{
		if(disconnected) {
			throw new InternetDisconnectionException("Internet disconnected, exception created");
		}
		else {
			System.out.println("Internet not disconnected");
		}
	}
	
	static void checkSessionTime(int minutes) throws SessionTimeoutException{
		if(minutes > 60) {
			throw new SessionTimeoutException("Session time out exception created");
		}
		else {
			System.out.println("Session time in");
		}
	}
	
	static void checkFileUpload(File f) throws FileUploadFailureException{
		if(f.exists()) {
			System.out.println("File exists");
		}
		else {
			throw new FileUploadFailureException("File upload failure exception created");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			boolean disconnected = false;
			checkInternet(disconnected);
		}
		catch(InternetDisconnectionException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			checkSessionTime(70);
		}
		catch(SessionTimeoutException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			File f = new File("Product.java");
			checkFileUpload(f);
		}
		catch(FileUploadFailureException e) {
			System.out.println(e.getMessage());
		}
	}
}
