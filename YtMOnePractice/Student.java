package YtMOnePractice;

public class Student {
	String studentName;
	Integer studentId;
	int studentScore;
	String scholarshipScheme;
	
	public Student(String studentName, Integer studentId, int studentScore) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentScore = studentScore;
		
		if(studentScore < 90) {
			scholarshipScheme = "no scheme";
		}
		else if(studentScore >= 90 && studentScore <= 95) {
			scholarshipScheme = "scheme b";
		}
		else {
			scholarshipScheme = "scheme a";
		}
		
	}
	
	@Override
	public String toString() {
		return "Student [studentName: " + studentName + ", studentId: "+studentId+", studentScore: "
				+studentScore+ ", scholarshipScheme: "+scholarshipScheme+"]";
	}
}