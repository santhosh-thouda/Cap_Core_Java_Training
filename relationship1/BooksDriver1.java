package relationship1;

public class BooksDriver1 {
	public static void main(String[] args) {
		
		Library1 l = new Library1();
//		Books1[] b = l.getBooks();
		
		for(int i = 0; i<l.getBooks().length; i++){
			System.out.println(l.getBooks()[i].getBook()); 
		}
	}
}
