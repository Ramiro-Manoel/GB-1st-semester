package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import TrabalhoGrauB.*;

class CartTest {

	@Test
	void seeCartTest1() {
	
		Cart cart = new Cart();
		Books book = new Books();
		cart.addProduct(book);
		
		boolean expectedReturn = true;
		
		assertEquals(expectedReturn, cart.SeeCart());
		
	}
	
	@Test
	void seeCartTest2() {
	
		Cart cart = new Cart();
		
		boolean expectedReturn = false;
		
		assertEquals(expectedReturn, cart.SeeCart());
		
	}
	
	@Test
	void finalValueTest1() {
	
		Cart cart = new Cart();
		
		Books book = new Books();
		book.setPrice(20);
		
		for(int i = 0; i < 3; i++) {
		cart.addProduct(book);
		}
		double expectedReturn = 60;
		
		assertEquals(expectedReturn, cart.finalValue());
		
	}
	
	@Test
	void finalValueTest2() {
	
		Cart cart = new Cart();
		
		HomeAppliances homeAppliances = new HomeAppliances();
		homeAppliances.setPrice(4.50);
		
		for(int i = 0; i < 3; i++) {
		cart.addProduct(homeAppliances);
		}
		double expectedReturn = 13.5;
		
		assertEquals(expectedReturn, cart.finalValue());
		
	}
	
	@Test
	void concludeTest1() {
		
		Cart cart = new Cart();
		
		Clothing clothing = new Clothing();
		clothing.setPrice(50.99);
		
		for(int i = 0; i < 1; i++) {
		cart.addProduct(clothing);
		}
		double expectedReturn = 50.99;
		
		assertEquals(expectedReturn, cart.finalValue());
		
	}
	
	@Test
	void concludeTest2() {
		
		Cart cart = new Cart();
		
		Electronics electronic = new Electronics();
		electronic.setPrice(1500);
		
		for(int i = 0; i < 2; i++) {
		cart.addProduct(electronic);
		}
		double expectedReturn = 3000;
		
		assertEquals(expectedReturn, cart.finalValue());
		
	}

}
