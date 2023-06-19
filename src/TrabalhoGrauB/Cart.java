package TrabalhoGrauB;

import java.util.ArrayList;

public class Cart {

	ArrayList<Product> shoppingList = new ArrayList();

	// Empty constructor
	public Cart() {
	}

	// Contructor
	public Cart(ArrayList<Product> shoppingList) {
		super();
		this.shoppingList = shoppingList;
	}

	// getters and setters
	public ArrayList<Product> getShoppingList() {
		return shoppingList;
	}

	public void setShoppingList(ArrayList<Product> shoppingList) {
		this.shoppingList = shoppingList;
	}

	// ToString
	@Override
	public String toString() {
		return "Cart [shoppingList=" + shoppingList + "]";
	}

	// method that receive the index of the product in the stock, add it in the cart
	// and decreases the quantity of the object in one
	public boolean addProduct(int index, Stock stock) {
		this.shoppingList.add(stock.getStockList().get(index));
		stock.getStockList().get(index).setQuantity(stock.getStockList().get(index).getQuantity() - 1);
		return true;
	}

	// method that receive the index of the product in the cart and removes it
	public boolean rmvProduct(int index, Stock stock) {

		shoppingList.get(index).setQuantity(shoppingList.get(index).getQuantity() + 1);
		this.shoppingList.remove(index);
		return true;
	}

	// method that, if there nothing in the cart says that the cart is empty and
	// return false, and if there's anything in the cart, it shows what inside it
	// and returns true
	public boolean SeeCart() {

		if (shoppingList.isEmpty()) {
			System.out.println("Your cart is empty");
			return false;
		} else {
			double finalValue = 0;
			System.out.println("Your cart:");
			for (Product e : shoppingList) {
				System.out.println(shoppingList.indexOf(e) + " - " + e.showProduct());
				finalValue += e.getPrice();
			}
			System.out.println("    Final price: R$" + finalValue);
			return true;
		}
	}

	// method that returns the sum of all the prices of the products in the cart
	public double finalValue() {
		double finalValue = 0;

		for (Product e : shoppingList) {
			finalValue += e.getPrice();
		}
		return finalValue;
	}

	// method that returns the sum of all the prices of the products in the cart and empties the cart
	public double conclude() {
		double finalValue = 0;

		for (Product e : shoppingList) {
			finalValue += e.getPrice();
		}
		shoppingList.clear();
		return finalValue;
	}

}
