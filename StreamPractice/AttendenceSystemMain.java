package StreamPractice;

import java.util.*;

public class AttendenceSystemMain {
	public static void main(String[] args) {
		ArrayList<AttendenceSystem> elist = new ArrayList<>();
		elist.add(new AttendenceSystem(101, "Santhu"));
		elist.add(new AttendenceSystem(102, "Arjun"));
		elist.add(new AttendenceSystem(103, "Hema"));
		elist.add(new AttendenceSystem(104, "John"));
		elist.add(new AttendenceSystem(101, "Santhu"));
		elist.add(new AttendenceSystem(102, "Arjun"));
		
		long result = elist.stream().distinct().count();
		System.out.println(result);
	}
}
