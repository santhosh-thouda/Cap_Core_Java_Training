package relationship1;

public class Library2 {
	Books2[] books;
	
	private Books2[] createBooks() {
		if(books == null) {
			books = new Books2[] {
					new Books2("Rich Dad Poor Dad"),
					new Books2("Think and Grow Rich"),
					new Books2("The Millionaire Mentor"),
					new Books2("The Psycology of Money")
			};
		}
		return books;
	}
	
	public Books2[] getBooks() {
		return createBooks();
	}
}
