package ExceptionHandling;

public class InvalidAgeException extends Throwable{
	public InvalidAgeException(String msg){
		super(msg);
	}
}
