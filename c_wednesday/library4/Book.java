package library4;

public class Book {

    String title;
    Author author;
    final String isbn;
    int physicalCopies;
    int availableCopies;
    int timesRented;

    public Book(String title, Author author, String isbn, int physicalCopies, int availableCopies, int timesRented) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.physicalCopies = physicalCopies;
        this.availableCopies = availableCopies;
        this.timesRented = timesRented;
    }

    @Override
    // I use he toString() method of author
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author.toString() + ", isbn=" + isbn + ", physicalCopies=" + physicalCopies + ", availableCopies=" + availableCopies + ", timesRented=" + timesRented + '}';
    }

    public boolean isAvailable() {
        return availableCopies > 0;
    }

    public boolean hasAuthor(String author) {
        // why equals and not == ??????
        return this.author.getName().equals(author);
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getPhysicalCopies() {
		return physicalCopies;
	}

	public void setPhysicalCopies(int physicalCopies) {
		this.physicalCopies = physicalCopies;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	public int getTimesRented() {
		return timesRented;
	}

	public void setTimesRented(int timesRented) {
		this.timesRented = timesRented;
	}

	public String getIsbn() {
		return isbn;
	}
    
    
}

