package library;

import java.util.Scanner;


public class Books {
	
	private String bookName;
	private String author;
	private Double price;
	private int bookQuantity;
	private String authorEmail;
	private String gender;
	
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice( ) {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public int getBookQuantity() {
		return bookQuantity;
	}
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity=bookQuantity;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail=authorEmail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String toString() {
		return "Book [ name ="+bookName+", email= "+authorEmail+", gender="+gender+" ]. price="+price+", quantity="+bookQuantity+" .";
	}
	
	public static void main(String[] args) {
		
		Scanner userInput=new Scanner(System.in);
		
		System.out.print("Give me an Book's Name: ");
		String userBookName=userInput.next();
		System.out.print("Give me the book's Author: ");
		String userAuthor=userInput.next();
		System.out.print("Give me the book's Price: ");
		double userPrice=userInput.nextDouble();
		System.out.print("Give me book's Quantity: ");
		int userBookQuantity=userInput.nextInt();
		System.out.print("Give me the author's Email: ");
		String userAuthorEmail=userInput.next();
		System.out.print("Give me the author's Gender: ");
		String userGender=userInput.next();
		
		
		Books book1=new Books();
		book1.setBookName(userBookName);
		book1.setAuthor(userAuthor);
		book1.setPrice(userPrice);
		book1.setBookQuantity(userBookQuantity);
		book1.setAuthorEmail(userAuthorEmail);
		book1.setGender(userGender);
		
		System.out.print(book1.toString());
		
		userInput.close();
		
	}

}
