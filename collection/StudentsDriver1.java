package collection;

import java.util.*;

// this is done using comparable (it means it doesn't use any third party class to compare, it just implements Comparable directly in a original class)
// this uses compareTo

class Students1 implements Comparable<Students1>{
	private int sid;
	private int sage;
	private String sname;
	private String scity;
	
	public Students1(){};
	
	public Students1(int sid, int sage, String sname, String scity){
		this.sid = sid;
		this.sage = sage;
		this.sname = sname;
		this.scity = scity;
	}
	
	public int getStudentId() {
		return sid;
	}
	
	@Override
	public String toString() {
		return "sid: "+sid+ ", sage: "+sage+", sname: "+sname+", scity: "+scity;
	}
	
	@Override
	public int compareTo(Students1 s) {
		return Integer.compare(this.sid, s.sid); 
	}
}

public class StudentsDriver1 {
	public static void main(String[] args) {
		
		ArrayList<Students1> studs1 = new ArrayList<>();
		
		studs1.add(new Students1(102, 21, "Santhu", "Hyderabad"));
		studs1.add(new Students1(101, 19, "Sanjana", "Jaipur"));
		studs1.add(new Students1(109, 29, "Arjun", "Mumbai"));
		studs1.add(new Students1(105, 42, "Yash", "Bangalore"));
		studs1.add(new Students1(106, 31, "Munawar", "Chandigarh"));
		studs1.add(new Students1(103, 28, "Chetan", "Pune"));
		
		Collections.sort(studs1);
		
		for(Students1 s : studs1) {
			System.out.println(s);
		}
	}
}
