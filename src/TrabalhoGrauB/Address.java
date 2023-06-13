package TrabalhoGrauB;

public class Address {
	
//Attribute Declaration
	
	private String state;
	private String city;
	private String street;
	private String number;
	
//Empty Constructor
	
	public Address () {
		super();
		
	}
	
//Constructor

	public Address(String state, String city, String street, String number) {
		super();
		this.state = state;
		this.city = city;
		this.street = street;
		this.number = number;
	}
	
//Getters&Setters

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
//toString
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", street=" + street + ", number=" + number + "]";
	}
	
	

}
