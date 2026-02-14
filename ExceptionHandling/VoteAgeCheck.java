package ExceptionHandling;

public class VoteAgeCheck {
	public static void main(String[] args) {
		try {
			checkAge(15);
		}
		catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void checkAge(int age) throws InvalidAgeException{
		if(age > 18) {
			System.out.println("Eligible to vote.");
		}
		else {
			throw new InvalidAgeException("Not Eligible to vote.");
		}
	}
}
