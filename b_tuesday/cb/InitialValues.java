package cb;

public class InitialValues {
	
	private int a;
	private long b;
	private byte c;
	private short d;
	private double e;
	private float f;
	private boolean g;
	private char h;
	private String i;
	
	
	/*
	VII_Values() {}
	
	VII_Values(int x,char y){
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	public char getY() {
		return y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(char y) {
		this.y=y;
	}
	public int Initialization() {
		System.out.print(x);
		return x;
	}
	public char Initialization2() {
		System.out.print(y);
		return y;
	}
	*/
	public static void main(String[] args) {
		
		InitialValues x=new InitialValues();
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		System.out.println(x.d);
		System.out.println(x.e);
		System.out.println(x.f);
		System.out.println(x.g);
		System.out.println(x.h);
		System.out.println(x.i);
		
	}
}