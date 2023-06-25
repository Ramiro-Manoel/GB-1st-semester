package Test;

import TrabalhoGrauB.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void showProductTest1() {
		
	Books book = new Books();
	
	book.setName("livro");
	book.setPrice(12.50);
	
	String expectedReturn = "Name: livro Price: R$" + 12.50;
	
	assertEquals(expectedReturn, book.showProduct());
	}
	
	@Test
	void showProductTest2() {
		
	Electronics electronics = new Electronics();
	
	electronics.setName("celular");
	electronics.setPrice(3000.99);
	
	String expectedReturn = "Name: celular Price: R$" + 3000.99;
	
	assertEquals(expectedReturn, electronics.showProduct());
	}
}
