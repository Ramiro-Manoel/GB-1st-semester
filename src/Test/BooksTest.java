package Test;

import TrabalhoGrauB.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BooksTest {

	@Test
	void detailTest1() {

		Books book = new Books("Pequeno Principe", 20.99, "Incredible book", 200, "Companhia da Letras", 123,
				"Antoine de Saint-Exupéry", true, 96);

	

		String expectedReturn = "Name: " + "Pequeno Principe" + "\nPrice: " + 20.99 + "\nDescription: " + "Incredible book" + "\nQuantity: " + 200 + 
				"\nBrand: " + "Companhia da Letras" + "\nIdentifier: " + 1123 + 
				"\nAuthor: " + "Antoine de Saint-Exupéry" + "\nPhysical: " + true + "\nPages: " + 96;
		
		assertEquals(expectedReturn, book.Details());
		}



void detailTest2() {

	Books book = new Books("The Chronicles of Narnia", 45.99, "fantasy book", 550, "Companhia da Letras", 505, "C. S. Lewis", false, 752);



	String expectedReturn = "Name: " + "The Chronicles of Narnia" + "\nPrice: " + 45.99 + "\nDescription: " + "fantasy book" + "\nQuantity: " + 550 + 
			"\nBrand: " + "Companhia da Letras" + "\nIdentifier: " + 1505 + 
			"\nAuthor: " + "C. S. Lewis" + "\nPhysical: " +false + "\nPages: " + 752;
	
	assertEquals(expectedReturn, book.Details());}

}
