package library4;

public class Library {

	private static Library library = new Library();
	private Book[] books;
	private Librarian librarian;
	
	private Library() {	}
	
	public static Library instance() {
		return library;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public Librarian getLibrarian() {
		return librarian;
	}

	public void setLibrarian(Librarian librarian) {
		this.librarian = librarian;
	}
	
}
