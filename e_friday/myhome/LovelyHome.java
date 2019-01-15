package myhome;


public class LovelyHome {
	String a=new String();
	AClass aclass=new AClass();
	
	private class ANewClass {
		
	}
	
	public LovelyHome() {
		// TODO Auto-generated constructor stub
		System.out.println("My Lovely Home");

		AClass aclass=new AClass();
	}
	public LovelyHome(String msg) {
        // TODO Auto-generated constructor stub
        System.out.println(msg);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		//LovelyHome aGirlyHome=new LovelyHome();
		//LovelyHome aGirlyHome2 = new LovelyHome("A Home!"); //instanciation
        AClass aclass=new AClass();
        Home h=new Home();
        //System.out.println(aGirlyHome);

	}

}

