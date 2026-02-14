package StreamPractice;

public class Payroll {
	private int eid;
	private String ename;
	private double salary;
	
	public Payroll(int eid, String ename, double salary) {
		this.setEid(eid);
		this.setEname(ename);
		this.setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String toString() {
		return eid+" "+ename+" "+salary;
	}
}
