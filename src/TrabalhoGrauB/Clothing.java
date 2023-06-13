package TrabalhoGrauB;

public class Clothing extends Product {
	
//Attribute Declaration
	
	private String fabric;

//Empty Constructor
	
	public Clothing() {
		super();
		
	}

//Constructor

	public Clothing(String fabric) {
		super();
		this.fabric = fabric;
	}

	
//Getters&Setters

	public String getFabric() {
		return fabric;
	}


	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	//toString
	
	@Override
	public String toString() {
		return "Clothing [fabric=" + fabric + "]";
	}
	
	//Methods
	
	public String Details() {
		return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nDescription: " + this.getDescription() + "\nQuantity: " + this.getQuantity() + 
				"\nBrand: " + this.getBrand() + "\nIdentifier: " + this.getIdentifier() + 
				"\nFabric: " + this.getFabric();
	}
	
	
}
