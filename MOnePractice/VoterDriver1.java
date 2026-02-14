package MOnePractice;

class Voter1{
	String voterId;
	String voterName;
	Integer voterAge;
	
	public Voter1(String voterId, String voterName) {
		this.voterId = voterId;
		this.voterName = voterName;
	}
	
	public String getVoterId() {
		return voterId;
	}
	
	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}
	
	public String getVoterName() {
		return voterName;
	}
	
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	
	public Integer getVoterAge() {
		return voterAge;
	}
	
	public void setVoterAge(Integer voterAge) {
		this.voterAge = voterAge;
	}
}

class VotingService1{
	public Integer parseAge(String voterAge) {
		try {
			return Integer.parseInt(voterAge);
		}
		catch(NumberFormatException e) {
			return null;
		}
	}
	
	public boolean isEligible(Integer voterAge) {
		return voterAge != null && voterAge >= 18;
	}
	
	public void displayStatus(Voter1 v) {
		if(v.getVoterAge() == null) {
			System.out.println(v.getVoterName()+ " --> Invalid Age Input");
		}
		else if(isEligible(v.getVoterAge())) {
			System.out.println(v.getVoterName()+ " --> Eligible to Vote");
		}
		else if(!isEligible(v.getVoterAge())){
			System.out.println(v.getVoterName()+ " --> Not Eligible to Vote");
		}
	}
}

public class VoterDriver1 {
	public static void main(String[] args) {
		Voter1 v1 = new Voter1("V101", "Aman");
		Voter1 v2 = new Voter1("V102", "Neha");
		Voter1 v3 = new Voter1("V103", "Rahul");
		
		VotingService1 vs = new VotingService1();
		
		v1.setVoterAge(vs.parseAge("25"));
		v2.setVoterAge(vs.parseAge("17"));
		v3.setVoterAge(vs.parseAge("abc"));
		
		vs.displayStatus(v1);
		vs.displayStatus(v2);
		vs.displayStatus(v3);
	}
}
