package Encapsulation;

class LibraryBooks1{
	private int available = 230;
	
	public int getBooks() {
		return available;
	}
	
	public void setBooks(int n) {
		System.out.println("Cannot be changed");
	}
}

public class LibraryBooks {
	public static void main(String[]args) {
		LibraryBooks1 lb = new LibraryBooks1();
		int n = lb.getBooks();
		System.out.println(n);
		lb.setBooks(929);
	}
}
