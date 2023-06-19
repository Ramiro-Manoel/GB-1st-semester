package TrabalhoGrauB;

import java.util.ArrayList;

public class Order {

//Attribute Declaration

	private ArrayList<Product> products = new ArrayList<>();
	private Client client;
	private Payment payment;

//Empty Constructor

	public Order() {
		super();

	}

//Constructor

	public Order(Client client, Payment payment) {
		super();
		this.client = client;
		this.payment = payment;
	}

//Getters&Setters

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

	// Methods

	// Shows the information of the order (client name, client address and all the
	// products bought) and returns true
	public boolean orderInfo() {
		System.out.println("Order " + "\nClient: " + client.ClientInfo() + "\nProducts: ");
		for (Product e : products) {
			System.out.println(e.showProduct());
		}
		return true;
	}

	//takes all the products in the cart and passes to the order. Returns true
	public boolean passProducts(Cart cart) {
		for (Product e : cart.getShoppingList()) {
			products.add(e);
		}
		return true;
	}

}
