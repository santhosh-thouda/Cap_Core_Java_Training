package YtMOnePractice;

public class RepositoryImplementation {
	public static String getCountry(String countryCode) throws InvalidCodeException{
		if(countryCode.length() > 3 || countryCode.length() < 2) {
			throw new InvalidCodeException("Invalid code detail found");
		}
		
		try {
			Integer.parseInt(countryCode);
		}
		catch(NumberFormatException e) {
			throw new InvalidCodeException("Code must be numeric");
		}
		
		return Repository.getCountryName(countryCode);
	}
}
