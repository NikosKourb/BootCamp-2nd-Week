package cb;

public class Rectangle_Creator {

	public static void main(String[] args) {
		
		//Scanner userInput=new Scanner(System.in);
		//System.out.print("Give me the x dimension for a ")
		
		Point p1=new Point();
		p1.setX(1); //ορίζω το x του σημείου p1
		p1.setY(5); //ορίζω το y του σημείου p1
		
		Point p2=new Point();
		p2.setX(5);
		p2.setY(5);
		
		Point p3=new Point();
		p3.setX(5);
		p3.setY(2);
		
		Point p4=new Point();
		p4.setX(1);
		p4.setY(2);
		
		
		Rectangle r1=new Rectangle();
		r1.setA(p1); //Ορίζω το σημείο Α του ορθ. παραλληλογράμου r1 
		             //με βαση τις τιμές(x,y) που έχει πάρει το p1
		r1.setB(p2); //Ορίζω το σημείο B του ορθ. παραλληλογράμου r1
		             //με βαση τις τιμές(x,y) που έχει πάρει το p2
		r1.setC(p3); //Ορίζω το σημείο C του ορθ. παραλληλογράμου r1
		             //με βαση τις τιμές(x,y) που έχει πάρει το p3
		r1.setD(p4); //Ορίζω το σημείο C του ορθ. παραλληλογράμου r1
		             //με βαση τις τιμές(x,y) που έχει πάρει το p4
		
		System.out.println("Τα σημεία των κορυφών του ορθογωνίου παραλληλογράμου σου είναι :");
		System.out.println("A"+"("+r1.getA().getX()+","+r1.getA().getY()+")");
		System.out.println("B"+"("+r1.getB().getX()+","+r1.getB().getY()+")");
		System.out.println("C"+"("+r1.getC().getX()+","+r1.getC().getY()+")");
		System.out.println("D"+"("+r1.getD().getX()+","+r1.getD().getY()+")");
		
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
	}

}


