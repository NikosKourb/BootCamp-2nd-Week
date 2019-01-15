package library4;

public class Librarian {
	private String name;
	private int id;

	public Librarian() {
	}

	public Librarian(String n, int id) {
		name = n;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void findMeBooksFromAuthor(String author, Book[] books) {
		StringBuilder answer = new StringBuilder("Books from " + author + ": ");
		for (Book book : books) {
			if (book.getAuthor().getName().equals(author)) {
				answer.append(book.toString());
			}
		}
		System.out.println(answer.toString());
	}

	public void findMeAvailableBooks(Book[] books) {
		StringBuilder answer = new StringBuilder("The available books are: \n");
		for (Book book : books) {
			if (book.isAvailable()) {
				answer.append(book.toString() + "\n");
			}
		}
		System.out.println(answer);
	}

	public void findMeBook(String title, Book[] books) {
		boolean exists = false;

		for (Book book : books) {
			if (book != null && book.getTitle().equals(title)) {
				exists = true;
				break;
			}
		}
		// Print book details if book is found
		if (exists) {
			System.out.println(title + " found");
		} else {
			System.out.println(title + " not found");
		}
	}

	public Book findMostPopularBook(Book[] books) {

		Book mostPopular = null;
		int count = 0;
		for (Book element : books) {
			if (element.timesRented > count) {
				mostPopular = element;
				count = element.timesRented;
			}
		}
		return mostPopular;
	}

	public boolean rentBook(Book bookToRent) {
		boolean rented = false;
		if (bookToRent.availableCopies > 1) {
			System.out.println("Book is rented");
			// Reduce available copies
			bookToRent.availableCopies--;
			// times rented
			bookToRent.timesRented++;
			rented = true;
		}
		return rented;
	}

}
