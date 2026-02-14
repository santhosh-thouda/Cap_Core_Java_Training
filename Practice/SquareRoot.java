package Practice;

public class SquareRoot {
	//method 1
	static double squareRoot1(int n) {
		return Math.sqrt(n);
	}
	
	//method 2
	static int squareRoot2(int n) {
		int sqrt = 0;
		for(int i = 1; i*i<=n; i++) {
			sqrt = i;
		}
		return sqrt;
	}
	
	//method 3 - binary search O (log n)
	
	static int squareRoot3(int n) {
		int ans = 0;
		int low = 0, high = n;
		while(low <= high) {
			int mid = low + (high - low)/2;
			if((long)mid * mid <= n) {
				ans = mid;
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return ans;
	}
	
	public static void main(String[]args) {
		int n = 688;
		System.out.println(squareRoot3(n));
	}
}
