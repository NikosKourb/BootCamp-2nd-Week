package cb;

//import java.lang.*;

public class Rectangle {
	
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	//Setting the default constructor 
	//to function along with the other
	public Rectangle() {}
	
	//Creating my own constructor  
	//who takes variable values, the way that I have set 
	//him below and then gives me a result
	public Rectangle(Point a,Point b,Point c,Point d) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		}
	
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a=a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b=b;
	}
	public Point getC() {
		return c;
	}
	public void setC(Point c) {
		this.c=c;
	}
	public Point getD() {
		return d;
	}
	public void setD(Point d) {
		this.d=d;
	}
	public double sideA() {
		return Math.abs(b.getX()-a.getX());
	}
	public double sideB() {
		return Math.abs(b.getY()-c.getY());
	}
	public double area() {
		return sideA()*sideB();
	}
	public double perimeter() {
		return (sideA()*2)+(sideB()*2);
	}
}
