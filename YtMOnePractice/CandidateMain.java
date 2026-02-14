package YtMOnePractice;

public class CandidateMain {
	public static void main(String[] args) throws Exception{
		Candidate data = new Candidate("Steve", 1020, 20);
		Validator2 check = new Validator2();
		
		System.out.println(check.eligible(data));
		System.out.println(check.sendInvite(data));
	}
}
