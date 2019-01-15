package shapes;

public class Circle {
	
	private Point radius;
	private Point center;
	public static final double pi=3.14159;
	
	//public double r=(Math.sqrt(Math.pow((Math.abs(radius.getX()-center.getX())),2)+Math.pow((Math.abs(radius.getX()-center.getX())),2)));
	
	public Circle() {}
	
	public Circle(Point c,Point r) {
		this.center=center;
		this.radius=radius;
	}
	
public Point getC() {
	return center;
}
public void setC(Point c) {
	this.center=center;
}
public Point getR() {
	return radius;
}
public void setR(Point r) {
	this.radius=radius;
}
public double Perimeter() {
	return 2*pi*(Math.sqrt(Math.pow((Math.abs(radius.getX()-center.getX())),2)+Math.pow((Math.abs(radius.getX()-center.getX())),2)));
}
public double Surface() {
	return pi*(Math.sqrt(Math.pow((Math.abs(radius.getX()-center.getX())),2)+Math.pow((Math.abs(radius.getX()-center.getX())),2)));
}

}