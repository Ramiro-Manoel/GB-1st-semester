package Test;

import TrabalhoGrauB.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BooksTest {

	@Test
	void test() {

		Books book = new Books("Pequeno Principe", 20.99, "Incredible book", 200, "Companhia da Letras", 123,
				"Antoine de Saint-Exupéry", true, 96);

		String expectedReturn = "Name: Pequeno Principe" + "\nPrice: 20.99" + "\nDescription: Incredible book"
				+ "\nQuantity: 200" + "\nBrand: Companhia da Letras" + "\nIdentifier: 123"
				+ "\nAuthor: Antoine de Saint-Exupéry" + "\nPhysical: true" + "\nPages: 96";

		assertEquals(expectedReturn, book.Details());}

}
