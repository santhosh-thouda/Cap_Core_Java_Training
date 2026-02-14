package Array;

public class StudentsMarks {
	public static void main(String[]args) {
		int[] marks = {97,32,81,29,74,25,92,64,34,12};
		int sum = 0;
		for(int i = 0; i<marks.length; i++) {
			sum += marks[i];
		}
		int average = sum/marks.length;
		System.out.println("Average marks: " +average);
		
		for(int i = 0; i<marks.length; i++){
			if(marks[i] > 90)System.out.println("A+ Grade");
			else if(marks[i] > 80 && marks[i] <= 90)System.out.println("A Grade");
			else if(marks[i] > 70 && marks[i] <= 80)System.out.println("B Grade");
			else if(marks[i] > 60 && marks[i] <= 70)System.out.println("C Grade");
			else if(marks[i] > 50 && marks[i] <= 60)System.out.println("D Grade");
			else if(marks[i] > 40 && marks[i] <= 50)System.out.println("E Grade");
			else System.out.println("F Grade");
		}
	}
}
