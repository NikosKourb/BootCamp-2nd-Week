package cb;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	
	public static void main(String[] args) {
		
		String answer=null;
		
		Scanner userIn=new Scanner(System.in);
		
		
			System.out.print("Please insert the path of the Telephone "
					+"Catalogue file you want"+"\n"+"to load, or "
					+" type 'd' to load the 'telcatalog.txt' : ");
			String pathChoice=userIn.next();
			
			String filename=null;
			
			if(pathChoice.equals("d")) {
				filename="././telcatalog.txt";
			}
			else {
				filename=pathChoice;
				}
			
			TelephoneCatalogue n1=new TelephoneCatalogue();
			n1.CreateAllArray(filename);
			
		do {
			System.out.println("------[Current  Array]-----");
			n1.ShowAllArray();
			System.out.print("\n");
			
			String str1="Which of the following actions do you want to do:"
					+"\n"+"SEARCH FOR(s) ,ENTER NEW CONTACT(e) ,"
					+"UPDATE CONTACT(u) ,DELETE CONTACT(d)"
					+"\n"+"Type the letter of the action you want to do: ";
					
			System.out.print(str1);
			String userChoice=userIn.next();
			System.out.print("\n");
			
			while(!userChoice.equals("s")&&!userChoice.equals("e")&&!userChoice.equals("u")&&!userChoice.equals("d")) {
				System.out.print("Invalid Input!!!"+"\n");
				System.out.print(str1);
				userChoice=userIn.next();
				System.out.print("\n");
				}
			
			
			//SEARCH FOR option
			if(userChoice.equals("s")) {
				System.out.print("What do you want to search for"+"\n"+"PHONE(p), NAME(n): ");
				userChoice=userIn.next();
				System.out.print("\n");
				
				while(!userChoice.equals("n")&&!userChoice.equals("p")) {
					System.out.print("Invalid Input!!!"+"\n");
					System.out.print("What do you want to search for:"+"\n"+"PHONE(p), NAME(n): ");
					userChoice=userIn.next();
					System.out.print("\n");
					}
				//NAME option 
				if(userChoice.equals("n")) {
					System.out.println("Please type the Phone you want to find the name of: ");
					String tel=userIn.next();
					System.out.println(n1.SearchArray(tel));
					}
				//PHONE option 
				else {
					System.out.println("Please type the person's name you want to find the Phone for (UPPERCASE):");
					String name=userIn.next();
					System.out.println(n1.SearchArray2(name));
					}
				}
			
			
			//ENTER NEW CONTACT option
			if(userChoice.equals("e")) {
				System.out.print("Enter the Name of the contact you want to create: ");
				String newName=userIn.next();
				System.out.print("\n");
				System.out.print("Enter "+n1.getName()+"'s Phone Number: ");
				String newPhone=userIn.next();
				System.out.print("\n");
				System.out.println(n1.CreateEntry(newName,newPhone));
				}
			
			
			//UPDATE CONTACT option
			if(userChoice.equals("u")) {
				System.out.print("Update contact's NAME(n) ,PHONE(p)?: ");
				userChoice=userIn.next();
				System.out.print("\n");
				
				while(!userChoice.equals("n")&&!userChoice.equals("p")) {
					System.out.print("Invalid Input!!!"+"\n");
					System.out.print("Update contact's NAME(n) ,PHONE(p)?: ");
					userChoice=userIn.next();
					System.out.print("\n");
					}
				//NAME option
				if(userChoice.equals("n")) {
					System.out.println("Please enter the phone number you want to Update the owner's Name: ");
					String tel=userIn.next();
					System.out.println(n1.UpdateEntry2(tel));
					}
				//PHONE option
				else {
					System.out.println("Please type the name of the contact you want to change the Phone Number (UPPERCASE): ");
					String name=userIn.next();
					System.out.println(n1.UpdateEntry(name));
					}
				}
			
			
			//DELETE CONTACT option
			if(userChoice.equals("d")) {
				System.out.print("Delete contact based on"+"\n"+"NAME(n) ,PHONE(p): ");
				userChoice=userIn.next();
				System.out.print("\n");
				
				while(!userChoice.equals("n")&&!userChoice.equals("p")) {
					System.out.print("Invalid Input!!!"+"\n");
					System.out.print("What do you want to search for:"+"\n"+"NAME(n) ,PHONE(p)");
					userChoice=userIn.next();
					System.out.print("\n");
					}
				//NAME option
				if(userChoice.equals("n")) {
					System.out.println("Please type the Person's Name you want his/her contact Deleted (UPPERCASE):");
					String name=userIn.next();
					//n1.setName(nameSearch);
					System.out.println(n1.DeleteEntry(name));
					}
				//PHONE option
				else {
					System.out.println("Please type the Telephone of the contact you want Deleted: ");
					String tel=userIn.next();
					//n1.setPhone(phoneSearch);
					System.out.println(n1.DeleteEntry2(tel));
					}
				}
			
			System.out.print("\n");
			System.out.print("Do you want to do Anything Else (y/n): ");
			answer=userIn.next();
			System.out.print("\n");
		
		}while(!answer.equals("n"));
		
		PrintWriter writer;
		
		try {
			writer=new PrintWriter("telcatalog(new).txt","UTF-8");
			
			
			for(int r=0;r<TelephoneCatalogue.catalogueAll.length;r++)	{
				writer.print("[  ");
				for(int c=0;c<TelephoneCatalogue.catalogueAll[0].length;c++) {
					writer.print(TelephoneCatalogue.catalogueAll[r][c]);
					for(int d=c;d<(TelephoneCatalogue.catalogueAll[0].length)-1;d++) {
						for(int w=0;w<(16-(TelephoneCatalogue.catalogueAll[r][c].length()));w++) {
							writer.print("-");
							}
						}
					}
				writer.print("  ]");
				writer.println();
				}
			writer.close();
		}
				
		catch (Exception ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null,ex);
		}
		
		userIn.close();
		}
	}
