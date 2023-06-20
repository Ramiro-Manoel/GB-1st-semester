package Test;
import TrabalhoGrauB.*;
import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

	@org.junit.jupiter.api.Test
	void seeAddressTest1() {
		
		Address address = new Address("RS", "São Leopoldo", "Av Mario Sperb", "874");
		
		String expectedReturn = "Av Mario Sperb, 874 - São Leopoldo - RS";
		
		
		
		assertEquals(expectedReturn, address.seeAddress());
		
	}
	
	@org.junit.jupiter.api.Test
	void seeAddressTest2() {
		
		Address address = new Address();
		
		address.setState("RR");
		
		address.setCity("Boa Vista");
		
		address.setStreet("Alameda Acácias");
		
		address.setNumber("123");
		
		String expectedReturn = "Alameda Acácias, 123 - Boa Vista - RR";
		
		
		
		assertEquals(expectedReturn, address.seeAddress());
		
	}

}
