package Encapsulation;

class EmpId{
	final int id;
	
	EmpId(int id){
		this.id = id;
	}
	
	public int getEmpId() {
		return id;
	}

//	public void setEmpId(int id) {
//		this.id = id;
//	}
}

public class EmployeeId {
	public static void main(String[]args) {
		EmpId eid = new EmpId(19);
		System.out.println(eid.getEmpId());
//		eid.setEmpId(39);
		System.out.println(eid.getEmpId());
	}
}
