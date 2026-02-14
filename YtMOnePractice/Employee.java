package YtMOnePractice;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	String name;
	String projectName;
	int workingHrs;
	int bonus;
	
	public Employee(String name, String projectName, int workingHrs) {
		this.name = name;
		this.projectName = projectName;
		this.workingHrs = workingHrs;
		this.bonus = 0;
	}
	
	public String setBonus() {
		List<String> list = new ArrayList<>();
		list.add("web");
		list.add("tech");
		list.add("hack");
		list.add("SD");
		list.add("PD");
		
		if(list.contains(projectName) && workingHrs >= 30) {
			bonus = workingHrs/10;
			return "Congrats";
		}
		else {
			return "Work hard";
		}
	}
	
	public String checkName() {
		if(name.equals("doselect")) {
			StringBuilder sb = new StringBuilder(projectName);
			sb.append(workingHrs);
			return sb.toString();
		}
		else {
			StringBuilder sb = new StringBuilder(projectName);
			sb.append(bonus);
			return sb.toString();
		}
	}
}
