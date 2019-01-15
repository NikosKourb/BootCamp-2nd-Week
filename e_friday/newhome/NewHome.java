package newhome;

public class NewHome {
	
	public AClass a=new AClass();
	public BClass b=new BClass();

	public NewHome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatHome gh=new GreatHome();

	}
	
	public class AClass {
		
		private AClass() {
			System.out.print("Default AClass");
		}
		
		private AClass(int a) {
			System.out.print("Default AClass int a");
		}
		
		public void aMethod() {
			System.out.print("AClass");
		}
		
	}
	
	private class BClass {
		public void aMethod() {
			System.out.print("BClass");
		}
	}

}
