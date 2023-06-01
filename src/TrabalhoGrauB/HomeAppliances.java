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
		return "HomeAppliances [power=" + power + "]";
	}
	


}
