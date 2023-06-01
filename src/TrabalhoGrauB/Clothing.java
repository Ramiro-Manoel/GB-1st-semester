package TrabalhoGrauB;

public class Clothing extends Product {
	
//Attribute Declaration
	
	private String fabric;

//Empty Constructor
	
	public Clothing() {
		super();
		
	}

//Constructor

	public Clothing(String name, double price, String description, int quantity, String brand, int identifier) {
		super(name, price, description, quantity, brand, identifier);
		
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
	
}
