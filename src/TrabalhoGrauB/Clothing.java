package TrabalhoGrauB;

public class Clothing extends Product {
	
//Attribute Declaration
	
	private String fabric;
	private String color;
//Empty Constructor
	
	public Clothing() {
		super();
		
	}

//Constructor

	public Clothing(String fabric, String color) {
		super();
		this.fabric = fabric;
		this.color = color;
	}


	public Clothing(String name, double price, String description, int quantity, String brand, int identifier, String fabric, String color) {
		super(name, price, description, quantity, brand, identifier + 3000);
		this.fabric = fabric;
		this.color = color;
	}
	
//Getters&Setters


	public String getFabric() {
		return fabric;
	}


	public void setFabric(String fabric) {
		this.fabric = fabric;
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
		return "Clothing [fabric=" + fabric + ", color=" + color + "]";
	}
	
	//Methods
	
	//returns all the info in details of the object
	public String Details() {
		return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nDescription: " + this.getDescription() + "\nQuantity: " + this.getQuantity() + 
				"\nBrand: " + this.getBrand() + "\nIdentifier: " + this.getIdentifier() + 
				"\nFabric: " + this.getFabric() + "\nColor: " + this.getColor();
	}

	
	
	
}
