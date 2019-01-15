package shapes;

import java.util.Scanner;

public class Shape_Creator {

	public static void main(String[] args) {
		
		Scanner userInput=new Scanner(System.in);
		
		System.out.println("Choose a shape you like to calculate it's Properties");
		System.out.println("Type R for a Rectangle and C for a Cicle : ");
		String userChoice=userInput.nextLine();
		
		if (userChoice.equals("R")) {
			System.out.println("Give me x,y coordinates for Point A: ");
			double userXa=userInput.nextDouble();
			double userYa=userInput.nextDouble();
			System.out.println("Give me x,y coordinates for Point B : ");
			double userXb=userInput.nextDouble();
			double userYb=userInput.nextDouble();
			System.out.println("Give me x,y coordinates for Point C : ");
			double userXc=userInput.nextDouble();
			double userYc=userInput.nextDouble();
			System.out.println("Give me x,y coordinates for Point D : ");
			double userXd=userInput.nextDouble();
			double userYd=userInput.nextDouble();
			
			Rectangle rNew=new Rectangle();
			
			Point a=new Point();
			a.setX(userXa);
			a.setY(userYa);
		
			Point b=new Point();
			b.setX(userXb);
			b.setY(userYb);
			
			
			
		}

	}

}
