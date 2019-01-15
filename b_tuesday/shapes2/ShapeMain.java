package shapes2;

public class ShapeMain {

	public static void main(String[] args) {
		
		// create Points
		Point p1 = new Point();
		p1.setX(1);
		p1.setY(5);
		
		Point p5 = new Point(3, 7);
		
		Point p2 = new Point();
		p2.setX(5);
		p2.setY(5);
		
		Point p3 = new Point();
		p3.setX(5);
		p3.setY(2);

		Point p4 = new Point();
		p4.setX(1);
		p4.setY(2);
		
		Rectangle r1 = new Rectangle();
		r1.setA(p1);
		r1.setB(p2);
		r1.setC(p3);
		r1.setD(p4);
		
		Rectangle r2 = new Rectangle(p1, p2, p3, p4);
		
		System.out.println("Ax = " + r1.getA().getX());
		System.out.println("Ay = " + r1.getA().getY());
		
		System.out.println("Bx = " + r1.getB().getX());
		System.out.println("By = " + r1.getB().getY());
		
		System.out.println("Cx = " + r1.getC().getX());
		System.out.println("Cy = " + r1.getC().getY());
		
		System.out.println("Dx = " + r1.getD().getX());
		System.out.println("Dy = " + r1.getD().getY());
		
		// print sides
		System.out.println("SideA of r1: " + r1.sideA());
		System.out.println("SideB of r1: " + r1.sideB());
		
		// calculate and display area and perimeter 
		System.out.println("Perimeter of r1: " + r1.perimeter());
		System.out.println("Area of r1: " + r1.area());
		
		// display PI
		System.out.println("My static final PI :" + Circle.PI);
		
		
		Point c = new Point(0, 0);
		int r = 8;
		//Circle c1 = new Circle(c, r);
		Circle c1 = new Circle();
		c1.setCenter(c);
		c1.setRadius(r);
		
		// calculate and display area and perimeter 
		System.out.println("Circumference of c1: " + c1.circumference());
		System.out.println("Area of c1: " + c1.area());
	}
}

