package library3;

import java.util.Random;
import java.util.Scanner;

public class Librarians_and_Main {

	private String librarianName;
	public String[] librariansList={"Scarlett Johansson","Alexandra Daddario","Amanda Seyfried","Zoe Saldana","Megan Fox","Gal Gadot","Salma Hayek"};
	
	
	public String getLibrarianName() {
		
		Random randomizer = new Random();
		int array_index=new Random().nextInt(librariansList.length);
		librarianName=(librariansList[array_index]);
		return librarianName;
	}
	
	

	public static void main(String[] args) {
		
		Librarians_and_Main l1=new Librarians_and_Main();
		
		System.out.println("Hello my name is "+l1.getLibrarianName()+" and I will be your Librarian for this search");
		Scanner userInput=new Scanner(System.in);
		System.out.print("Give me a Book's Name : ");
		String Book=userInput.next();
		
		Library lib1=new Library();
		lib1.setBookName(Book);
		
		System.out.println("The fact that the "+Book+" is in our Library is "+lib1.getLibrarianAnswer());
		
		if(lib1.getLibrarianAnswer()==true) {
			
			int book_index=lib1.getBookIndex();
			
			Authors a1=new Authors();
			a1.setAuthorNameIndex(book_index);
			String the_author=a1.getAuthorName();
			
			System.out.println("The Author of the book "+Book+" is "+the_author);
		}

	}

}
