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
	
	
	
	
}
