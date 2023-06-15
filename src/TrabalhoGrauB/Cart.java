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

	public boolean addProduct(int index, Stock stock) {
		this.shoppingList.add(stock.getStockList().get(index));
		stock.getStockList().get(index).setQuantity(stock.getStockList().get(index).getQuantity() - 1);
		return true;
	}

	public boolean rmvProduct(int index, Stock stock) {

		shoppingList.get(index).setQuantity(shoppingList.get(index).getQuantity()+1);
		this.shoppingList.remove(index);
		return true;
	}

	public boolean SeeCart() {

		if (shoppingList.isEmpty()) {
			System.out.println("Your cart is empty");
		} else {
			for (Product e : shoppingList) {
				System.out.println(shoppingList.indexOf(e) + " - " + e.showProduct());
			}
		}

		return true;
	}

	public double conclude() {
		double finalValue = 0;
		
		for(Product e: shoppingList) {
			finalValue += e.getPrice();
		}
		shoppingList.clear();
		return finalValue;
	}

	
}
	