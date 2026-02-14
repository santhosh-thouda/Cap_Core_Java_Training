package Relationship;

public class MainLibrary {
	public static void main(String[] args) {
		Library l = new Library();
		l.addBook(new Book(120));
		l.addBook(new Book(150));
		l.addBook(new Book(250));
	}
}
