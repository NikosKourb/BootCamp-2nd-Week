package library3;

public class Authors {
	
	public String[] authorList= {"J.R.R.Tolkien","J.R.R.Tolkien","J.R.R.Tolkien","Yann_Martel","Charles_Darwin","Sun_Tzu","Dan_Brown"};
	
	private String authorName;
	private int authorNameIndex;
	
	public int getAuthorNameIndex() {
		return authorNameIndex;
	}
	public void setAuthorNameIndex(int authorNameIndex) {
		this.authorNameIndex=authorNameIndex;
	}
	
	public String getAuthorName() {
		String theAuthor=authorList[getAuthorNameIndex()];
		authorName=theAuthor;
		return authorName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
