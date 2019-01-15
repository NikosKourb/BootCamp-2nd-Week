package shapes2;

public class Circle {
	public static final double PI = 3.14159;
	private Point center;
	private int radius;
	
	public Circle() {}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int diameter() {
		return 2 * radius;
	}
	
	public double area() {
		return PI * Math.pow(radius, 2);
	}
	
	public double circumference() {
		return 2 * PI * radius;
	}
}
