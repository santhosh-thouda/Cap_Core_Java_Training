package ExceptionHandlingPractice1;

class WrongCredentialsException extends Exception{
	WrongCredentialsException(String msg){
		super(msg);
	}
}

class ServerDownException extends Exception{
	ServerDownException(String msg){
		super(msg);
	}
}
   
class TokenExpiredException extends Exception{
	TokenExpiredException(String msg){
		super(msg);
	}
}

public class MobileApp {
	public static String username = "santhoshthouda";
	public static String password = "santhosh123";
	
	public static void checkCredentials(String username, String password) throws WrongCredentialsException{
		if(MobileApp.username.equals(username) && MobileApp.password.equals(password)) {
			System.out.println("Details entered correctly");
		} 
		else {
			throw new WrongCredentialsException("Wrong Credentials Exception occured.");
		}
	}
	
	static void serverDown(boolean serverdown) throws ServerDownException{
		if(serverdown) {
			System.out.println("Server is working good");
		}
		else {
			throw new ServerDownException("Server Down Exception occured");
		}
	}
	
	static void tokenExpiry(int seconds) throws TokenExpiredException{
		if(seconds > 60) {
			throw new TokenExpiredException("Token expired exception occured");
		}
		else {
			System.out.println("Token is not expired");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkCredentials("santhoshthouda", "santhosh123");
		}
		catch(WrongCredentialsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			serverDown(false);
		}
		catch(ServerDownException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			tokenExpiry(65);
		}
		catch(TokenExpiredException e) {
			System.out.println(e.getMessage());
		}
	}
}
