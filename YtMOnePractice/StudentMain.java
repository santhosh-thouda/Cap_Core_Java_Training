package YtMOnePractice;

public class StudentMain {
	public static void main(String[] args) {
		ScholarshipImple si = new ScholarshipImple();
		si.addStudent(new Student("Marry", 666, 93));
		System.out.println(si.getStudentDetails("scheme b"));
		System.out.println(si.deleteStudent(909));
	}
}
