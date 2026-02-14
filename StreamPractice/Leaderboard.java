package StreamPractice;

public class Leaderboard {
	private int sid;
	private String sname;
	private double score;
	
	Leaderboard(int sid, String sname, double score){
		this.setSid(sid);
		this.setSname(sname);
		this.setScore(score);
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public String toString() {
		return "Id: "+sid+", Name: "+sname+", Score: "+score;
	}
}
