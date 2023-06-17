package TrabalhoGrauB;

public class HomeAppliances extends Product {

//Attributes Declaration
	
	private int power;
	
//Empty Constructor
	
	public HomeAppliances() {
		super();
		
	}

//Constructor

	public HomeAppliances(int power) {
		super();
		this.power = power;
	}

	public HomeAppliances(String name, double price, String description, int quantity, String brand, int identifier, int power) {
		super(name, price, description, quantity, brand, identifier);
		this.power = power;
	}
	
//Getters&Setters
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
//toString
	
	@Override
	public String toString() {
		return super.toString() + "HomeAppliances [power=" + power + "]";
	}
	
//Methods
	
	public String Details() {
		return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nDescription: " + this.getDescription() + "\nQuantity: " + this.getQuantity() + 
				"\nBrand: " + this.getBrand() + "\nIdentifier: " + this.getIdentifier() + 
				"\nPower: " + this.getPower();
	}
	


}
