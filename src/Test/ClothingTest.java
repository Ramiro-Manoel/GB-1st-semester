package Test;

import TrabalhoGrauB.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClothingTest {

	@Test
	void DetailsTest1() {
		
		Clothing clothing = new Clothing("casaco de lã", 300, "muito confortável", 20, "GAP", 123, "lã", "preto");
		
		String expectedReturn = "Name: " + clothing.getName() + "\nPrice: " + clothing.getPrice() + "\nDescription: " + clothing.getDescription() + "\nQuantity: " + clothing.getQuantity() + 
				"\nBrand: " + clothing.getBrand() + "\nIdentifier: " + clothing.getIdentifier() + 
				"\nFabric: " + clothing.getFabric() + "\nColor: " + clothing.getColor();
		
		assertEquals(expectedReturn, clothing.Details());
	}
	@Test
	void DetailsTest2() {
		
		Clothing clothing = new Clothing("calça Jeans", 200, "versátil", 120, "Levis", 450, "Jeans", "Azul");
		
		String expectedReturn = "Name: " + clothing.getName() + "\nPrice: " + clothing.getPrice() + "\nDescription: " + clothing.getDescription() + "\nQuantity: " + clothing.getQuantity() + 
				"\nBrand: " + clothing.getBrand() + "\nIdentifier: " + clothing.getIdentifier() + 
				"\nFabric: " + clothing.getFabric() + "\nColor: " + clothing.getColor();
		
		assertEquals(expectedReturn, clothing.Details());
	}
}
