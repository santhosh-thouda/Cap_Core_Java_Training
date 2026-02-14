package YtMOnePractice;

public class PersonMain1 {
	public static void main(String[] args) throws Exception {
		Person1 p1 = new Person1("Santhosh", "13-07-2005", "santhoshthouda1@doselect.com");
		
		Implementation i = new Implementation();
		try {
			System.out.println(i.validator(p1));
		}
		catch(InvalidDateException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
