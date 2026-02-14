package collection1;

//use of hashset

public class Teacher{
	int tid;
	String age;
	String tname;
	String tcity;
	
	Teacher(int tid, String age, String tname, String tcity){
		this.tid = tid;
		this.age = age;
		this.tname = tname;
		this.tcity = tcity;
	}
	
	public String toString() {
		return "Tid: "+tid+", Tname: "+tname+", Tage: "+age+", Tcity: "+tcity;
	}
}
