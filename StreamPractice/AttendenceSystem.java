package StreamPractice;

import java.util.*;

public class AttendenceSystem {
	private int eid;
	private String ename;
	
	AttendenceSystem(int eid, String ename){
		this.setEid(eid);
		this.setEname(ename);
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	

	public String toString() {
		return "Id: "+eid+", Name: "+ename;
	}
	
	public boolean equals(Object o) {
		if(this == o)return true;
		if(!(o instanceof AttendenceSystem))return false;
		AttendenceSystem that = (AttendenceSystem)o;
		return eid == that.eid;
	}
	
	public int hashCode() {
		return Objects.hash(eid);
	}
}
