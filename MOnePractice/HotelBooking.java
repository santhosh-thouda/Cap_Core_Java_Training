package MOnePractice;

public class HotelBooking {
	public void validateUserDetails(int age, String email, String creditCard) throws InvalidBookingDetailsException{
		if(age >= 18 && age <= 100) {
			System.out.println("Age Validated");
			
			if(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]\\com$")) {
				System.out.println("Email Validated");
				
				if(creditCard.length() == 16 && !creditCard.matches("\\d{16}")) {
					System.out.println("Credit card validated");
				}
				else {
					throw new InvalidBookingDetailsException("Invalid Card details");
				}
			}
			else {
				throw new InvalidBookingDetailsException("Invalid email");
			}
		}
		else{
			throw new InvalidBookingDetailsException("Invalid age");
		}
	}
	
	
}
