package TrabalhoGrauB;

import java.util.ArrayList;

public class Stock {

	ArrayList<Product> stockList = new ArrayList();

	// Contrutor vazio
	public Stock() {
	}

	// contrutor com atributo
	public Stock(ArrayList<Product> stockList) {
		super();
		this.stockList = stockList;
	}

	// getters e setters
	public ArrayList<Product> getStockList() {
		return stockList;
	}

	public void setStockList(ArrayList<Product> stockList) {
		this.stockList = stockList;
	}

	@Override
	public String toString() {
		return "Stock [stockList=" + stockList + "]";
	}

	// metodo para adicionar produto no estoque
	public boolean addProduct(Product product) {
		this.stockList.add(product);
		return true;
	}

	// metodo remove produto informando o nome do objeto
	public boolean rmvProduct(Product product) {
		this.stockList.remove(product);
		return true;
	}

	// metodo remove produto informando a posicao do objeto na lista
	public boolean rmvProduct(int number) {
		this.stockList.remove(number);
		return true;
	}

	// metodo exibe todos os itens do estoque
	public boolean seeStock() {
		if(stockList.isEmpty()) {
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

	// metodo procura produto pelo codigo
	public Product search(int indentifier) {
		for (Product e : stockList) {
			if (e.getIdentifier() == indentifier) {
				return e;
			} else {
				return null;
			}
		}
		return null;

	}

	// metodo exibe apenas os itens de uma determinada categoria

	public boolean filter(int filter) {

		switch (filter) {
		// products with the identifier between 1000 and 1999 are books
		case 1:
			for (Product e : stockList) {

				if (e.getIdentifier() >= 1000 && e.getIdentifier() < 2000) {
					System.out.println(stockList.indexOf(e) + " - " + e.showProduct());
				}
			}
			break;

		// products with the identifier between 2000 and 2999 are home appliances
		case 2:
			for (Product e : stockList) {

				if (e.getIdentifier() >= 2000 && e.getIdentifier() < 3000) {
					System.out.println(stockList.indexOf(e) + " - " + e.showProduct());
				}
			}
			break;

		// products with the identifier between 3000 and 3999 are clothing
		case 3:
			for (Product e : stockList) {

				if (e.getIdentifier() >= 3000 && e.getIdentifier() < 4000) {
					System.out.println(stockList.indexOf(e) + " - " + e.showProduct());
				}
			}
			break;

		// products with the identifier between 4000 and 4999 are electronics
		case 4:
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
