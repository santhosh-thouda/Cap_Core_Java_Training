package YtMOnePractice;

public class Repository {
	
	public static String getCountryName(String countryCode) throws InvalidCodeException{
		if (countryCode.equals("011")) {
            return "Dial somewhere outside of India";
        }
		
		int code = Integer.parseInt(countryCode);
		
		if(code >= 70 && code <=99) {
			return "India";
		}
		else if(code == 908){
			return "US";
		}
		else {
			throw new InvalidCodeException("No country with the given code found");
		}
	}
}
