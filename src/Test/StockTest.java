package Test;

import TrabalhoGrauB.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StockTest {

	@Test
	void addProductTest1() {
		
		Stock stock = new Stock();
		
		boolean expectedReturn = true;
		
		assertEquals(expectedReturn, stock.addProduct(new Books()));
		
	}
	@Test
	void rmvProductTest1() {
		
		Stock stock = new Stock();
		
		boolean expectedReturn = false;
		
		assertEquals(expectedReturn, stock.rmvProduct(0));
		
	}
	@Test
	void rmvProductTest2() {
		
		Stock stock = new Stock();
		
		stock.addProduct(new Books());
		boolean expectedReturn = true;
		
		assertEquals(expectedReturn, stock.rmvProduct(0));

	}
	
	@Test
	void seeStockTest1() {
		
		Stock stock = new Stock();
	
		boolean expectedReturn = false;
		
		assertEquals(expectedReturn, stock.seeStock());

	}
	
	@Test
	void seeStockTest2() {
		
		Stock stock = new Stock();
		
		stock.addProduct(new Books());
		boolean expectedReturn = true;
		
		assertEquals(expectedReturn, stock.seeStock());

	}
	@Test
	void searchTest1() {
		
		Stock stock = new Stock();
		Books book = new Books();
		book.setIdentifier(1234);
		
		stock.addProduct(book);
		
		
		assertEquals(book, stock.search(1234));

	}
	@Test
		void searchTest2() {
		
		Stock stock = new Stock();
		Electronics eletronic = new Electronics();
		eletronic.setIdentifier(4321);
		
		stock.addProduct(eletronic);
		
		
		assertEquals(eletronic, stock.search(4321));

	}
	
	@Test
	void filterTest1() {
		
		Stock stock = new Stock();
		
		boolean expectedReturn = true;
		
		assertEquals(expectedReturn, stock.filter(2));

	}
	@Test
	void filterTest2() {
		
		Stock stock = new Stock();
		
		boolean expectedReturn = false;
		
		assertEquals(expectedReturn, stock.filter(5));

	}
}
