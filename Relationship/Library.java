package Relationship;

public class Library {
	private Book[] book = new Book[3];
	int i = 0;
	
	// helper method
	void addBook(Book b) {
		book[i] = b;
		i++;
	}
	
	// getter method
	Book[] getBook() {
		return book;
	}
}