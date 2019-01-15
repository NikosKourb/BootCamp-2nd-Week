package shapes;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Circle_Builder {

	public static void main(String[] args) {
		
		Circle c1=new Circle();
		
		Scanner userInput=new Scanner(System.in);
		//try 
		//{
		System.out.println("Give me x,y coordinates for circle Center: ");
		double userCx=userInput.nextDouble();
		double userCy=userInput.nextDouble();
		
		System.out.println("Give me x,y coordinates for circle Radius : ");
		double userRx=userInput.nextDouble();
		double userRy=userInput.nextDouble();
		
		Point center=new Point();
		center.setX(userCx);
		center.setY(userCy);
		
		Point radius=new Point();
		radius.setX(userRx);
		radius.setY(userRy);
		
		DecimalFormat numberFormat = new DecimalFormat("#.00000");
		//System.out.println(numberFormat.format(c1.Perimeter()));
		
		System.out.print(Math.sqrt(Math.pow((Math.abs(radius.getX()-center.getX())),2)+Math.pow((Math.abs(radius.getX()-center.getX())),2)));
		//System.out.print(c1.Perimeter());
		//System.out.println("Your Circle's Perimeter = "+c1.Perimeter());
		//System.out.println("Your Circle's Surface = "+c1.Surface());
		//}
		//catch(exception(type) e(object) 
		//		{
		//	}
		userInput.close();
	}

}
