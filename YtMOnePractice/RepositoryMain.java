package YtMOnePractice;

public class RepositoryMain{
	public static void main(String[] args){
		try {
			System.out.println(RepositoryImplementation.getCountry("78"));
			System.out.println(RepositoryImplementation.getCountry("011"));
			System.out.println(RepositoryImplementation.getCountry("98"));
			System.out.println(RepositoryImplementation.getCountry("120"));
			System.out.println(RepositoryImplementation.getCountry("1920"));
		}
		catch(InvalidCodeException e) {
			System.out.println(e.getMessage());
		}
	}
}