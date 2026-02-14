package Methods;

public class EligibilityCheck {
	static boolean eligible(int age) {
		return age > 18;
	}
	
	public static void main(String[]args) {
		int age = 19;
		System.out.println(eligible(age) ? "Yes, Eligible to Vote" : "Not Eligible to Vote");
	}
}
