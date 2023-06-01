package TrabalhoGrauB;

public class Books extends Product {

//Attributes Declaration
	
	private String Author;
	private boolean physical;
	private int pages;
	
//Empty Constructor
	
	public Books() {
		super();
		
	}

//Constructor
	
public Books(String author, boolean physical, int pages) {
	super();
	Author = author;
	this.physical = physical;
	this.pages = pages;
}

//Getters&Setters

public String getAuthor() {
	return Author;
}

public void setAuthor(String author) {
	Author = author;
}

public boolean isPhysical() {
	return physical;
}

public void setPhysical(boolean physical) {
	this.physical = physical;
}

public int getPages() {
	return pages;
}

public void setPages(int pages) {
	this.pages = pages;
}

//toString

@Override
public String toString() {
	return "Books [Author=" + Author + ", physical=" + physical + ", pages=" + pages + "]";
}
	


	
	
	
}
