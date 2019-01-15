package library2;

public class MainBook {
	public static void main(String[] args) {
        Author author = new Author();
        Book b = new Book();
        b.setAuthor(author);
        author.setName("George Pasparakis");
        author.setEmail("info@paspa.gr");
        author.setGender('m');

        b = new Book();
        b.setAuthor(author);
        b.setName("Internal Peace");
        b.setPrice(44.0);
        b.setQty(2);
        System.out.println(b.toString());
    }
}