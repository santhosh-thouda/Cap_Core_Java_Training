package Operators;

public class CollegeAttendenceRules {
	public static void main(String[]args) {
		int totalWorkingDaya = 30;
		int daysAttended = 26;
		int daysNeedToAttend = 25;
		boolean eligible = (daysAttended >= daysNeedToAttend);
		System.out.println(eligible ? "Eligible" : "Not Eligible");
	}
}
