package YtMOnePractice;

public class Implementation {
	public String validator(Person1 details) throws Exception{
		String[] year = details.dateOfBirth.split("-");
		
		if(Integer.parseInt(year[year.length - 1]) > 2000) {
			throw new InvalidDateException("date year must be less than 2000");
		}
		if(!details.email.matches("^[A-Za-z0-9+_.-]+@doselect.com$")) {
			throw new InvalidEmailException("only @doselect.com domain email are accepted");
		}
		return "valid details";
	}
	
	public String submitDetails(Person1 details) {
		try {
			validator(details);
			return "details submitted successfully";
		} 
		catch (InvalidDateException e) {
			return "Invalid details";
		}
		catch(InvalidEmailException e) {
			return "Invalid details";
		}
		catch(Exception e) {
			return "other exception";
		}
	}
}
