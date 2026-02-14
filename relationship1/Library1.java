package relationship1;

public class Library1 {
	private Books1 []books;
	
	public Library1(){
		books = new Books1[] {
				new Books1("Rich Dad Poor Dad"),
				new Books1("Think and Grow Rich"),
				new Books1("Deep Work"),
				new Books1("Ikigai")
		};
	}
	
	public Books1[] getBooks() {
		return books; 
	}
	
	
}
