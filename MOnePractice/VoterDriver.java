package MOnePractice;

class Voter {
	String voterId;
	String voterName;
	Integer voterAge;
	
	Voter(String voterId, String voterName){
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

class VotingService{
	public Integer parseAge(String age) {
		try {
			return Integer.parseInt(age);
		}
		catch(NumberFormatException e) {
			return null;
		}
	}
	
	public boolean isEligible(Integer age) {
		return age != null && age >= 18;
	}
	
	public void displayStatus(Voter v) {
		if(v.getVoterAge() == null) {
			System.out.println(v.getVoterName()+ " age is invalid.");
		}
		else if(isEligible(v.getVoterAge())) {
			System.out.println(v.getVoterName()+ " is eligible to vote.");
		}
		else {
			if(!isEligible(v.getVoterAge())){
				System.out.println(v.getVoterName()+ " is not eligible to vote.");
			}
		}
	}
}

public class VoterDriver{
	public static void main(String[] args) {
		Voter v1 = new Voter("V101", "Aman");
		Voter v2 = new Voter("V102", "Neha");
		Voter v3 = new Voter("V103", "Rahul");
		
		VotingService v = new VotingService();
		v1.setVoterAge(v.parseAge("25"));
		v2.setVoterAge(v.parseAge("17"));
		v3.setVoterAge(v.parseAge("abc"));
		
		v.displayStatus(v1);
		v.displayStatus(v2);
		v.displayStatus(v3);
	}
}