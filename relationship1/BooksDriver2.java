package relationship1;

public class BooksDriver2 {
	public static void main(String[] args) {
		Library2 l = new Library2();
		
		for(int i = 0; i<l.getBooks().length; i++) {
			System.out.println(l.getBooks()[i].getBook());
		}
	}
}
