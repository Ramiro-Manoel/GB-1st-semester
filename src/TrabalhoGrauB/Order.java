package TrabalhoGrauB;

import java.util.ArrayList;

public class Order {
	
//Attribute Declaration
	
	private int indentifier;
	private ArrayList products;
	private Client client;
	private Payment payment;
	
//Empty Constructor
	
	public Order () {
		super ();
		
	}
	
//Constructor

	public Order(int indentifier, ArrayList products, Client client, Payment payment) {
		super();
		this.indentifier = indentifier;
		this.products = products;
		this.client = client;
		this.payment = payment;
	}
	
//Getters&Setters

	public int getIndentifier() {
		return indentifier;
	}

	public void setIndentifier(int indentifier) {
		this.indentifier = indentifier;
	}

	public ArrayList getProducts() {
		return products;
	}

	public void setProducts(ArrayList products) {
		this.products = products;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
//Methods
	
	public boolean data () {
		return true;
		
	}
	
	

}
