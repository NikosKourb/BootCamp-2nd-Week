package arrays;

import java.util.Scanner;

public class Arrays {
	
	int[] intArray= new int[10];
	
	private int arrayLength=10;
	private int userNum;
	private int userIntSearch;
	private boolean searchAnswer;
	private int userIntSearchIndex;
	
	Arrays() {}
	
	Arrays(int arrayLength){
		this.arrayLength=arrayLength;
		this.intArray=new int[arrayLength];
		this.userIntSearch=userIntSearch;
		this.searchAnswer=searchAnswer;
		this.userIntSearchIndex=userIntSearchIndex;
	}
	
	
	//Method that SETS the value for how many integers the empty new Integer Array can hold
	//VIA user input
	public void setArrayLength(int arrayLength) {
		this.arrayLength=arrayLength;
		}
	//Method that GETS the value for how many integers the empty new Integer Array can hold
	//VIA the Setting Method above
	public int getArrayLength() {
		return arrayLength;
		}
	
	
	//Method that SETS the Integer the machine will search
	//VIA User input
	public void setUserIntSearch(int userIntSearch) {
		this.userIntSearch=userIntSearch;
		}
	//Method that GETS the Integer the machine will search
	//VIA the Setting Method above
	public int getUserIntSearch() {
		return userIntSearch;
		}
	
	
	//Method that GETS the index of a integer the user has inputed 
	public int getUserIntSearchIndex() {
		for(int i=0;i<intArray.length;i++) {
		    if(intArray[i]==getUserIntSearch()) {
		    	userIntSearchIndex=i;
		    	break;
		    	}
		    }
		return userIntSearchIndex;
	}
	
	
	//Method that searches if the integer the User Inputed is in the Array he created
	public boolean getSearchAnswer() {
		for(int i=0;i<intArray.length;i++) {
		    if(intArray[i]==getUserIntSearch()) {
		    	searchAnswer=true;
		    	break;
		    	}
		    else {
		    	searchAnswer=false;
		    	}
		    }
		return searchAnswer;
		}

	
	public static void main(String[] args) {
		
		Scanner userIn=new Scanner(System.in);
		
		System.out.print("Give me the Number of Integers you want the Array to have "
		+"\n"+",or type 0 if you want the array to have 10 places by default: ");
		int userarraylength=userIn.nextInt();
		if(userarraylength==0) {
			Arrays a1=new Arrays(10);
			System.out.print(a1.getArrayLength());
		}
		else {
			Arrays a1=new Arrays(userarraylength);
			for(int i=0;i<a1.getArrayLength();i++) {
				System.out.print("Give me an Integer to populate the array: ");
				int usernum=userIn.nextInt();
				a1.intArray[i]=usernum;
			}
			
			//Prints the existing Array
			System.out.print("\n"+"{");
			for(int j=0;j<a1.getArrayLength()-1;j++) {
				System.out.print(a1.intArray[j]+",");
			}
			System.out.print(a1.intArray[userarraylength-1]);
			System.out.print("}"+"\n");
			
			//Checks if the integer is in the Array
			System.out.println("\n"+"Give me an integer you want me to search for: ");
			int userIntSearch=userIn.nextInt();
			a1.setUserIntSearch(userIntSearch);
			
			//Prints True or False whether the integer the user gave is in the array or not
			System.out.println("The fact that the number "+a1.getUserIntSearch()+
					"is in the"+"\n"+"Array that you created is: "+a1.getSearchAnswer());
			
			
			System.out.println("\n"+"Give me an integer you want me to find it's index: ");
			int userIntSearch2=userIn.nextInt();
			a1.setUserIntSearch(userIntSearch2);
			
			if(a1.getSearchAnswer()==true) {
				
				//Prints the index of the number inside the Array
				System.out.println("The index of the number (or the first instance of it)"
						+"\n"+"that you gave, inside the array is: "+a1.getUserIntSearchIndex());
			}
			else {
				System.out.println("The number you gave is not included in the array!!!");
			}	
			}
			
			
			//Finds the integer the user searches
			
		
		
		
		userIn.close();
	}
}
/*	
for(int j=userarraylength-1;j>-1;j--) {
	if(a1.intArray[j]>usernum) {
		
		for(int k=userarraylength-1;k>j+1;k--) {
			a1.intArray[k]=a1.intArray[k-1];
		}
		a1.intArray[j+1]=usernum;
	}
	else {
		for(int u=userarraylength-1;u>0;u--) {
			a1.intArray[u]=a1.intArray[u-1];	
		}
		a1.intArray[0]=usernum;
	}
}

*/

