package Test;

import TrabalhoGrauB.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderHistoryTest {

	@Test
	void addOrderTest1() {
		OrderHistory orderHistory = new OrderHistory();
		
		boolean expectedReturn = true;
		
		assertEquals(expectedReturn, orderHistory.addOrder(new Order()));
	}
	
	@Test
	void rmvOrderTest1() {
		OrderHistory orderHistory = new OrderHistory();
		
		boolean expectedReturn = true;
		orderHistory.addOrder(new Order());
		
		assertEquals(expectedReturn, orderHistory.rmvOrder(0));
	}
	@Test
	void rmvOrderTest2() {
		OrderHistory orderHistory = new OrderHistory();
		
		boolean expectedReturn = false;
		orderHistory.addOrder(new Order());
		
		assertEquals(expectedReturn, orderHistory.rmvOrder(2));
	}
	
	@Test
	void seeOrderHistoryTest1() {
		OrderHistory orderHistory = new OrderHistory();
		
		orderHistory.addOrder(new Order());
		boolean expectedReturn = true;
		
		
		assertEquals(expectedReturn, orderHistory.seeOrderHistory());
	}
	
	@Test
	void seeOrderHistoryTest2() {
		OrderHistory orderHistory = new OrderHistory();
		
		boolean expectedReturn = false;
		
		
		assertEquals(expectedReturn, orderHistory.seeOrderHistory());
	}
	
}
