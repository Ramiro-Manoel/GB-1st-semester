package Test;
import TrabalhoGrauB.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClientTest {

	@Test
	void clientInfoTest1() {
		Cart cart = new Cart();
		Address address = new Address("RS", "São Leopoldo", "Av Mario Sperb", "874");
		Client client = new Client("Ramiro", address, cart);
		
		String expectedReturn = "name: Ramiro\naddress: Av Mario Sperb, 874 - São Leopoldo - RS";
		
		assertEquals(expectedReturn, client.ClientInfo());
		
	}
	
	@Test
	void clientInfoTest2() {
		Cart cart = new Cart();
		Address address = new Address("RS", "Parobé", "Véra Cruz", "270");
		Client client = new Client("Felipe", address, cart);
		
		String expectedReturn = "name: Felipe\naddress: Véra Cruz, 270 - Parobé - RS";
		
		assertEquals(expectedReturn, client.ClientInfo());
		
	}

}
