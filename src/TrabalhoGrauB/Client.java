package TrabalhoGrauB;

public class Client {
	
//Attributes Declaration
	
	private String name;
	private Address address;
	private Cart cart;
	
//Empty Constructor
	
	public Client () {
		super ();
		
	}

	
//Constructor
	
	public Client(String name, Address address, Cart cart) {
		super();
		this.name = name;
		this.address = address;
		this.cart = cart;
}
	
//Getters&Setters
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}

	
//toString

	@Override
	public String toString() {
		return "Client [name=" + name + ", address=" + address + "]";
	}
	
	//Returns the information of the client
	public String ClientInfo() {
		return "name: " + name + "\naddress: " + address.seeAddress();
	}

}
