package collection;

import java.util.*;

// this is done using comparator (it means using a third party class that implements comparator)

class Students{
	private int sid;
	private int sage;
	private String sname;
	private String scity;
	
	public Students(){};
	
	public Students(int sid, int sage, String sname, String scity){
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
}



class StudentsCom implements Comparator<Students>{
	Students s = new Students();
	public int compare(Students s1, Students s2) {
		return s1.getStudentId() - s2.getStudentId();
	}
}



public class StudentsDriver {
	public static void main(String[] args) {
		ArrayList<Students> studs = new ArrayList<>();
		studs.add(new Students(102, 21, "Santhu", "Hyderabad"));
		studs.add(new Students(101, 19, "Sanjana", "Jaipur"));
		studs.add(new Students(109, 29, "Arjun", "Mumbai"));
		studs.add(new Students(105, 42, "Yash", "Bangalore"));
		studs.add(new Students(106, 31, "Munawar", "Chandigarh"));
		studs.add(new Students(103, 28, "Chetan", "Pune"));
		
		Collections.sort(studs, new StudentsCom());
		
		for(Students s : studs) {
			System.out.println(s);
		}
	}
}
