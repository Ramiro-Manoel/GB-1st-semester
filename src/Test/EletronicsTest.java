package Test;

import TrabalhoGrauB.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EletronicsTest {

	@Test
	void DetailsTeste1() {
		
		Electronics eletronic = new Electronics("Galaxy S8", 3000, "celular com boa tela", 120, "samsung", 50,"celular", "preto");

		String expectedReturn = "Name: " + "Galaxy S8" + "\nPrice: " + 3000.00 + "\nDescription: " + "celular com boa tela" + "\nQuantity: " + 120 + 
		"\nBrand: " + "samsung" + "\nIdentifier: " + 4050 + 
		"\nType: " +"celular" + "\nColor: " +"preto";
		
		assertEquals(expectedReturn, eletronic.Details());
	}
	
	@Test
void DetailsTeste2() {
		
		Electronics eletronic = new Electronics("Kindle", 500, "aparelho para leitura digital", 560, "amazon", 890,"aparelho leitura digital", "branco");

		String expectedReturn = "Name: " + "Kindle" + "\nPrice: " + 500.00 + "\nDescription: " + "aparelho para leitura digital" + "\nQuantity: " + 560 + 
		"\nBrand: " + "amazon" + "\nIdentifier: " + 4890 + 
		"\nType: " + "aparelho leitura digital" + "\nColor: " + "branco";
		
		assertEquals(expectedReturn, eletronic.Details());
	}

}
