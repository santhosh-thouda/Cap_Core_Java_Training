package YtMOnePractice;

public class Validator2 {
	public String eligible(Candidate details)throws Exception{
		if(details.totalRating < 1000) {
			throw new CriteriaMismatchException("minimum 1000 total rating is required");
		}
		if(details.totalContest < 10) {
			throw new CriteriaMismatchException("minimum 10 contest participation is required");
		}
		
		return "eligible candidate";
	}
	
	public String sendInvite(Candidate details)throws Exception{
		try {
			eligible(details);
			return "Invitation send";
		}
		catch(CriteriaMismatchException e) {
			return "candidate is not eligible";
		}
		catch(Exception e) {
			return "Other exception";
		}
	}
}
