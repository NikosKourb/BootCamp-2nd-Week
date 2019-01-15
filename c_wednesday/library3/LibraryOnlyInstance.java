package library3;

public class LibraryOnlyInstance{
	
	private static LibraryOnlyInstance unique_library_instance;
	
	public static LibraryOnlyInstance getInstance() {
		if(unique_library_instance==null) {
			unique_library_instance=new LibraryOnlyInstance();
		}
		return unique_library_instance;
	}
}

/*
package cb;

public static __Library_only_instance getInstance() {

	public static void main(String[] args) {
		if(unique_library_instance==null) {
			unique_library_instance==new __Library_only_instance();
			
			return unique_library_instance;
		}

	}

}
*/