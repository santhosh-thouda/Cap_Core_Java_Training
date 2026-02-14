package Methods;

public class StudentGrade {
	static char gradeCheck(int sub1, int sub2, int sub3) {
		int total = sub1 + sub2 + sub3;
		int grade = total/3;
		if(grade > 90)return 'A';
		else if(grade > 80 && grade <= 90)return 'B';
		else if(grade > 70 && grade <= 80)return 'C';
		else if(grade > 60 && grade <= 70)return 'D';
		else return 'E';
	}
	
	public static void main(String[]args){
		int sub1 = 98;
		int sub2 = 84;
		int sub3 = 63;
		System.out.println(gradeCheck(sub1, sub2, sub3));
	}
}
