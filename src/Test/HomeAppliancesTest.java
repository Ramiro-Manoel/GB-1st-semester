package Test;

import TrabalhoGrauB.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HomeAppliancesTest {

	@Test
	void DetaislTest1() {
		
		HomeAppliances homeAppliance = new HomeAppliances("geladeira", 5000, "mantem comida gelada", 4000, "eletrolux", 32, 220);
		
		String expectedReturn = "Name: " + "geladeira" + "\nPrice: " + 5000.00 + "\nDescription: " + "mantem comida gelada" + "\nQuantity: " + 4000 + 
				"\nBrand: " + "eletrolux" + "\nIdentifier: " + 2032 + 
				"\nPower: " + 220;
		
		assertEquals(expectedReturn, homeAppliance.Details());
	}

	@Test
	void DetaislTest2() {
		
		HomeAppliances homeAppliance = new HomeAppliances("Maquina de lavar louça", 3500, "lava pratos e copos", 250, "brastemp", 552, 110);
		
		String expectedReturn = "Name: " + "Maquina de lavar louça" + "\nPrice: " + 3500.00 + "\nDescription: " + "lava pratos e copos" + "\nQuantity: " + 250 + 
				"\nBrand: " + "brastemp" + "\nIdentifier: " + 2552 + 
				"\nPower: " + 110;
		
		assertEquals(expectedReturn, homeAppliance.Details());
	}
}
