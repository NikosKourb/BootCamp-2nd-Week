package shapes2;

public class Rectangle {
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	public Rectangle() { }
	
	public Rectangle(Point a, Point b, Point c, Point d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public Point getA() {
		return a;
	}
	
	public void setA(Point a) {
		this.a = a;
	}
	
	public Point getB() {
		return b;
	}
	
	public void setB(Point b) {
		this.b = b;
	}
	
	public Point getC() {
		return c;
	}
	
	public void setC(Point c) {
		this.c = c;
	}
	
	public Point getD() {
		return d;
	}
	
	public void setD(Point d) {
		this.d = d;
	}
	
	public int sideA() {
		return Math.abs(b.getX() - a.getX());
	}
	
	public int sideB() {
		return Math.abs(b.getY() - c.getY());
	}
	
	public int area() {
		return sideA() * sideB();
	}
	
	public int perimeter() {
		return 2 * sideA() + 2 * sideB();
	}
}
