package library3;

import java.util.Scanner;

public class Library {
	
	String[] bookList={"The_Fellowship_of_the_Ring","The_two_Towers","The_Return_of_the_King","The_Life_of_Pi","The_Origin_of_Species","The_Art_of_War","The_DaVinci_Code"};
	
	private boolean librarianAnswer;
	private String bookName;
	private int bookIndex;
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	public int getBookIndex() {
		if(librarianAnswer=true) {
			int index=0;
			for(int i=0;i<bookList.length;i++) {
				if(bookList[i].equals(getBookName())) {
					index=i;
					break;
				}
			}
			bookIndex=index;
		}
		return bookIndex;
	}
	public boolean getLibrarianAnswer() {
		
		for(int i=0;i<bookList.length;i++) {
		    if(bookList[i].equals(getBookName())) {
		    	librarianAnswer=true;
		    	break;
		    	}
		    else {
		    	librarianAnswer=false;
		    }
		}
		return librarianAnswer;
	}

	/*
	public static void main(String[] args) {
		
		Scanner userInput=new Scanner(System.in);
		System.out.print("Give me a Book's Name : ");
		String Book=userInput.nextLine();
		Library lib1=new Library();
		//lib1.setBookName();

	}
	*/
}
