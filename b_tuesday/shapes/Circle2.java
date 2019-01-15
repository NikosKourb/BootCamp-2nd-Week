package shapes;

import java.util.Scanner;


public class Circle2 {
	private double r;
	private String c;
	public static final double pi=3.14159;
	
	
	public Circle2() {
		double r=1.0;
		String c="red";
	}
	
	public Circle2(double r) {
		String c="red";
		this.r=r;
	}

	public double getRadius() {
		return r;
	}
	public String getColor() {
		return c;
	}
	public void setRadius(double r) {
		this.r=r;
	}
	public void setColor(String c) {
		this.c=c;
	}
	
	public double getArea() {
		return pi*Math.pow(r,2);
	}
	public String toString() {
		return "Color = "+getColor()+", Radius = "+getRadius()+", Surface = "+getArea();
	}
	
	public static void main(String[] args) {
		
		Circle2 c1=new Circle2();
		Scanner userInput=new Scanner(System.in);
		
		System.out.print("Give me a number for the circle's Radius : ");
		double userRadius=userInput.nextDouble();
		System.out.print("Give me a Color for the circle : ");
		String userColor=userInput.next();
		
		
		c1.setRadius(userRadius);
		c1.setColor(userColor);
		
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());
		System.out.println(c1.toString());
		
		userInput.close();
	}
	
}
