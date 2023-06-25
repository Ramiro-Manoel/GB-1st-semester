package Test;

import TrabalhoGrauB.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderTest {

	@Test
	void orderInfoTest1() {
		Client client = new Client("Ramiro", new Address("RS", "São Leopoldo", "Av Mario Sperb", "874"), new Cart());
		Order order = new Order(client, new Payment());
		
		boolean expectedReturn = false;
		
		assertEquals(expectedReturn, order.orderInfo());
	}
	
	@Test
	void orderInfoTest2() {
	
		Client client = new Client("Ramiro", new Address("RS", "São Leopoldo", "Av Mario Sperb", "874"), new Cart());
		Order order = new Order(client, new Payment());
		
		order.getProducts().add(new Books());
		
		boolean expectedReturn = true;
		
		assertEquals(expectedReturn, order.orderInfo());
	}
	
	
	@Test
	void passProductsTest1() {
		
		Cart cart = new Cart();
		cart.addProduct(new Books());
		
		Client client = new Client("Ramiro", new Address("RS", "São Leopoldo", "Av Mario Sperb", "874"), new Cart());
		Order order = new Order(client, new Payment());
		
		order.getProducts().add(new Books());
		
		boolean expectedReturn = true;
		
		assertEquals(expectedReturn, order.passProducts(cart));
	}
	
	@Test
	void passProductsTest2() {
	
		Cart cart = new Cart();

		
		Client client = new Client("Ramiro", new Address("RS", "São Leopoldo", "Av Mario Sperb", "874"), new Cart());
		Order order = new Order(client, new Payment());
		
		order.getProducts().add(new Books());
		
		boolean expectedReturn = false;
		
		assertEquals(expectedReturn, order.passProducts(cart));
	}
	
	
}
