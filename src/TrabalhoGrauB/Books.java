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

//Constructors
	
public Books(String author, boolean physical, int pages) {
	super();
	this.Author = author;
	this.physical = physical;
	this.pages = pages;
}

public Books(String name, double price, String description, int quantity, String brand, int identifier, String author, boolean physical, int pages) {
	super(name, price, description, quantity, brand, identifier + 1000);
	this.Author = author;
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

//Methods

//returns all the info in details of the object
public String Details() {
	return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nDescription: " + this.getDescription() + "\nQuantity: " + this.getQuantity() + 
			"\nBrand: " + this.getBrand() + "\nIdentifier: " + this.getIdentifier() + 
			"\nAuthor: " + this.getAuthor() + "\nPhysical: " + this.isPhysical() + "\nPages: " + this.getPages();
}
	


	
	
	
}
