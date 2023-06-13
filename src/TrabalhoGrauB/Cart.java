package TrabalhoGrauB;

import java.util.ArrayList;

public class Cart {
	
	ArrayList<Product> shoppingList = new ArrayList();

	//Empty constructor
	public Cart() {}
	
	//Contructor
	public Cart(ArrayList<Product> shoppingList) {
		super();
		this.shoppingList = shoppingList;
	}

	//getters and setters
	public ArrayList<Product> getShoppingList() {
		return shoppingList;
	}

	public void setShoppingList(ArrayList<Product> shoppingList) {
		this.shoppingList = shoppingList;
	}

	//ToString
	@Override
	public String toString() {
		return "Cart [shoppingList=" + shoppingList + "]";
	}
	
	public boolean addProduct(int index, int amount,Stock stock) {
		this.shoppingList.add(stock.stockList.get(index));
		stock.getStockList().get(index).setQuantity(stock.getStockList().get(index).getQuantity()- amount);;
		return true;
	}
	

	
}
