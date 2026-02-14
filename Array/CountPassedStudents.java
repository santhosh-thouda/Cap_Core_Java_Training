package Array;

public class CountPassedStudents {
	
	public static void main(String[]args) {
		int[] marks = {97,32,81,29,74,25,92,64,34,12};
		int count = 0;
		for(int i = 0; i<marks.length; i++) {
			if(marks[i] >= 35)count++;
		}
		System.out.println(count);
	}
}
