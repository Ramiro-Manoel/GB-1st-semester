package TrabalhoGrauB;

public class teste {

	public static void main(String[] args) {
		
		
		String expectedReturn = "Name: copo Price: R$" + 12.50;
		
		Books book = new Books();
		
		book.setName("copo");
		book.setPrice(12.50);
		
		System.out.println(expectedReturn);
		System.out.println(book.showProduct());
	}

}
