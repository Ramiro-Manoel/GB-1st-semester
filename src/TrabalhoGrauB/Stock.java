package TrabalhoGrauB;

import java.util.ArrayList;

public class Stock {

	ArrayList<Product> stockList = new ArrayList();

	// constructor (doesn't need any attributes)
	public Stock() {
	}

	// getters and setters
	public ArrayList<Product> getStockList() {
		return stockList;
	}

	public void setStockList(ArrayList<Product> stockList) {
		this.stockList = stockList;
	}

	// tooString
	@Override
	public String toString() {
		return "Stock [stockList=" + stockList + "]";
	}

	// method that receives and adds an product to the stock ArrayList. Returns true
	public boolean addProduct(Product product) {
		this.stockList.add(product);
		return true;
	}

	// method that receives and removes a product. Returns true
	public boolean rmvProduct(Product product) {
		this.stockList.remove(product);
		return true;
	}

	// method that receives the index of the ArrayList and removes the product in
	// the position received. Returns true
	public boolean rmvProduct(int number) {
		this.stockList.remove(number);
		return true;
	}

	// method that shows all the products in the stock and returns true. If the
	// stock is empty, it says that the stock is empty and return false
	public boolean seeStock() {
		if (stockList.isEmpty()) {
			System.out.println("The stock is empty");
			return false;
		} else {
			System.out.println("Stock:");
			for (Product e : stockList) {
				if (e.getQuantity() > 0) {
					System.out.println(stockList.indexOf(e) + " - " + e.showProduct());
				}
			}
			return true;
		}
	}

	// method that searches for and product with the identifier equals the number
	// received, if it founds, it return the product found
	public Product search(int identifier) {
		for (Product e : stockList) {
			if (e.getIdentifier() == identifier) {
				return e;
			} else {
				return null;
			}
		}
		return null;

	}

	// method that filters the products by the identifier, showing only one category
	// of product

	public boolean filter(int filter) {

		switch (filter) {
		// products with the identifier between 1000 and 1999 are books
		case 1:
			System.out.println("Books: ");
			for (Product e : stockList) {

				if (e.getIdentifier() >= 1000 && e.getIdentifier() < 2000) {
					System.out.println(stockList.indexOf(e) + " - " + e.showProduct());
				}
			}
			break;

		// products with the identifier between 2000 and 2999 are home appliances
		case 2:
			System.out.println("Home appliances: ");
			for (Product e : stockList) {

				if (e.getIdentifier() >= 2000 && e.getIdentifier() < 3000) {
					System.out.println(stockList.indexOf(e) + " - " + e.showProduct());
				}
			}
			break;

		// products with the identifier between 3000 and 3999 are clothing
		case 3:
			System.out.println("Clothing: ");
			for (Product e : stockList) {

				if (e.getIdentifier() >= 3000 && e.getIdentifier() < 4000) {
					System.out.println(stockList.indexOf(e) + " - " + e.showProduct());
				}
			}
			break;

		// products with the identifier between 4000 and 4999 are electronics
		case 4:
			System.out.println("Eletronic: ");
			for (Product e : stockList) {

				if (e.getIdentifier() >= 4000 && e.getIdentifier() < 5000) {
					System.out.println(stockList.indexOf(e) + " - " + e.showProduct());
				}
			}
			break;

		default:
			System.out.println("invalid option");
			break;
		}

		return true;

	}

}
