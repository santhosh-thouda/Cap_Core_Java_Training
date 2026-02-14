package Practice;

public class SunnyNumber {
	static boolean sunnyNum(int n) {
		int target = n + 1;
		
		for(int i = 0; i*i<=target; i++) {
			if(i * i == target)return true;
		}
		return false;
	}
	
	public static void main(String[]args) {
		int n = 076;
		System.out.println(sunnyNum(n) ? "Yes it is a sunny number" : "No it is not a sunny number");
	}
}
