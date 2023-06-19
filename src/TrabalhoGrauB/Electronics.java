package TrabalhoGrauB;

public class Electronics extends Product {

//Attribute Declaration
	
	private String type;
	private String color;
	
	
//Empty Constructor
	
	public Electronics() {
		super();
		
	}

//Constructor

	public Electronics(String type, String color) {
		super();
		this.type = type;
		this.color = color;
	}
	
	public Electronics(String name, double price, String description, int quantity, String brand, int identifier,  String type, String color) {
		super(name, price, description, quantity, brand, identifier + 4000);
		this.type = type;
		this.color = color;
	}

//Getters&Setters



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}

	//toString

	@Override
	public String toString() {
		return "Electronics [type=" + type + ", color=" + color + "]";
	}
	
	//Methods
	
	//returns all the info in details of the object
	public String Details() {
		return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nDescription: " + this.getDescription() + "\nQuantity: " + this.getQuantity() + 
				"\nBrand: " + this.getBrand() + "\nIdentifier: " + this.getIdentifier() + 
				"\nType: " + this.getType() + "\nColor: " + this.getColor();
	}
	
	
	
	
}
