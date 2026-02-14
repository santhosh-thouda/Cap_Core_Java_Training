package YtMOnePractice;

public class AlmanacMain {
	public static void main(String[] args) {
		
		Almanac alm = new Almanac();
		System.out.println(alm.assignProject("Santhosh", "DSA 5 Problems"));
		System.out.println(alm.assignProject("Arjun", "Flutter assignment"));
		System.out.println(alm.assignProject("Santhosh", "Java topics"));
		System.out.println(alm.assignProject("YashKarle", "Embedded systems"));
		
		System.out.println(alm.currentProjects("Santhosh"));
		System.out.println(alm.currentProjects("Arjun"));
		System.out.println(alm.currentProjects("YashKarle"));
		
		alm.finishProject("Santhosh", "Java topics");
		System.out.println(alm.currentProjects("Santhosh"));
	}
}
