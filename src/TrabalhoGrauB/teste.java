package TrabalhoGrauB;

public class teste {

	public static void main(String[] args) {
		
		Books b1 = new Books ();
		//System.out.println(b1.details());
		
		Clothing c1 = new Clothing ();
		b1.setIdentifier(123);
		//System.out.println(c1.details());
		
		Electronics e1 = new Electronics ();
		//System.out.println(e1.details());
		
		HomeAppliances h1 = new HomeAppliances ();
		//System.out.println(h1.details());
		
		Stock s1 = new Stock ();
		s1.addProduct(b1);
		s1.addProduct(e1);
		System.out.println(s1.search(123).Details());
		
	}

}
