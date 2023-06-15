package TrabalhoGrauB;

public class teste {

	public static void main(String[] args) {

		Books b1 = new Books();
		// System.out.println(b1.details());

		Clothing c1 = new Clothing();
		b1.setIdentifier(123);
		// System.out.println(c1.details());

		Electronics e1 = new Electronics();
		// System.out.println(e1.details());

		HomeAppliances h1 = new HomeAppliances();
		// System.out.println(h1.details());

		Stock s1 = new Stock();
		b1.setQuantity(2);
		b1.setPrice(4);
		s1.addProduct(b1);
		e1.setQuantity(2);
		s1.addProduct(e1);

		Cart c = new Cart();

		
		c.addProduct(0, s1);
		c.addProduct(0, s1);
		
		
		c.SeeCart();
	}
}
