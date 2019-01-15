package cb;

public class Enum_Example {


	// A simple enum example where enum is declared 
	// outside any class (Note enum keyword instead of 
	// class keyword) 
	enum Color 
	{ 
	    RED, GREEN, BLUE; 
	} 
	
	
	enum Day 
	{ 
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
	    THURSDAY, FRIDAY, SATURDAY; 
	} 
	
	public static void main(String[] args) 
	    { 
	        Color c1 = Color.RED; 
	        System.out.println(c1); 
	        
	        Day d1=Day.FRIDAY;
	        System.out.print(d1);
	    } 
	
}
