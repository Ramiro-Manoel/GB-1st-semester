package TrabalhoGrauB;

import java.util.Scanner;

public class Main {

	public static int checkUserType() {

		Scanner scanner = new Scanner(System.in);
		int password = 123456;
		int testPassword = 0;
		System.out.println("Would you like to use the progam as:" + "\n1 - Costumer" + "\n2 - Empolyee"
				+ "\n3 - leave the progam");

		int option = scanner.nextInt();

		switch (option) {
		case 1:
			return 1;

		case 2:
			System.out.println("Type the password:");

			while (testPassword != password) {
				testPassword = scanner.nextInt();
				if (testPassword == password) {
					return 2;
				} else {
					System.out.println("Wrong password! try again");
				}
			}
			break;

		case 3:
			System.out.println("Thank you for using our progam!");

		}
		return 0;
	}

	public static Client createClient() {

		Scanner scanner = new Scanner(System.in);

		String[] adressInfo = new String[4];

		System.out.println("Your name:");
		String name = scanner.nextLine();

		System.out.println("Your state: ");
		adressInfo[0] = scanner.nextLine();
		System.out.println("Your city: ");
		adressInfo[1] = scanner.nextLine();
		System.out.println("Your street: ");
		adressInfo[2] = scanner.nextLine();
		System.out.println("Your house number: ");
		adressInfo[3] = scanner.nextLine();

		return new Client(name, new Address(adressInfo[0], adressInfo[1], adressInfo[2], adressInfo[3]), new Cart());
	}

	public static void stockMenu(Stock stock, Cart cart) {

		Scanner scanner = new Scanner(System.in);
		int option = 0;

		while (option != 3) {
			if (stock.seeStock()) {

				System.out.println("\n options:" + "\n1 - See details of a product" + "\n2 - Add product in your cart"
						+ "\n3 - Leave");

				option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("Which product do you want to see the details?");
					System.out.println(stock.getStockList().get(scanner.nextInt()).Details());
					System.out.println("\nType \"ok\" to go back to the stock");
					scanner.next();
					break;

				case 2:
					System.out.println("Which product do you want to add in your cart?");
					int productIndex = scanner.nextInt();
					System.out.println("How many of this products do you want to add?");
					int amount = scanner.nextInt();
					for (int i = 0; i < amount; i++) {
						cart.addProduct(productIndex, stock);
					}
					System.out.println("Product(s) added to your cart\n");
					break;

				case 3:
					break;

				default:
					System.out.println("invalid option");
					break;
				}
			} else {
				option = 3;
			}
		}
	}

	public static void cartMenu(Stock stock, Cart cart) {

		Scanner scanner = new Scanner(System.in);
		int option = 0;

		while (option != 3) {
			if (cart.SeeCart()) {

				System.out.println("\n options:" + "\n1 - See details of a product"
						+ "\n2 - Remove product of your cart" + "\n3 - Proceed to checkout"
								+ "\n4 - Leave");
				option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("Which product do you want to see the details?");
					System.out.println(cart.getShoppingList().get(scanner.nextInt()).Details());
					System.out.println("\nType \"ok\" to go back to the stock");
					scanner.next();
					break;

				case 2:
					System.out.println("Which product do you want to remove from your cart?");
					int productIndex = scanner.nextInt();
					System.out.println("How many of this products do you want to remove?");
					int amount = scanner.nextInt();
					for (int i = 0; i < amount; i++) {
						cart.rmvProduct(productIndex, stock);
					}
					System.out.println("Product(s) removed from your cart\n");
					break;

				case 3:
					
					break;
					
				case 4:
					break;

				default:
					System.out.println("invalid option");
					break;
				}
			} else {
				option = 4;
			}
		}
	}

	public static void profileMenu(Client client) {

		Scanner scanner = new Scanner(System.in);
		int option = 0;

		while (option != 2) {

			System.out.println(client.ClientInfo());
			System.out.println("Would you like to change anything?" + "\n1 - Yes" + "\n2 - No");
			switch (option = scanner.nextInt()) {
			case 1:
				System.out.println("what do you want to change?" + "\n1 - Name" + "\n2 - State" + "\n3 - City"
						+ "\n4 - Street" + "\n5 - House number" + "\n6 - Nothing");
				switch (scanner.nextInt()) {
				case 1:
					System.out.println("Type the new name:");
					scanner.nextLine();
					client.setName(scanner.nextLine());
					break;
				case 2:
					System.out.println("Type the new state:");
					scanner.nextLine();
					client.getAddress().setState(scanner.nextLine());
					break;
				case 3:
					System.out.println("Type the new city:");
					scanner.nextLine();
					client.getAddress().setCity(scanner.nextLine());
					break;
				case 4:
					System.out.println("Type the new street:");
					scanner.nextLine();
					client.getAddress().setStreet(scanner.nextLine());
					break;
				case 5:
					System.out.println("Type the new house number:");
					scanner.nextLine();
					client.getAddress().setNumber(scanner.nextLine());
					break;
				case 6:
					break;
				default:
					System.out.println("invalid option");
					break;
				}
				break;

			case 2:
				break;
			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Stock stock = new Stock();
		int option = 0;

		Books book = new Books();
		book.setQuantity(3);
		stock.addProduct(book);

		int user = checkUserType();
		switch (user) {
		case 1:
			Client client = createClient();

			while (option != 4) {
				System.out.println("Options: " + "\n1 - See stock" + "\n2 - See your cart" + "\n3 - See your profile"
						+ "\n4 - Leave");
				option = scanner.nextInt();

				switch (option) {

				case 1:
					stockMenu(stock, client.getCart());
					break;

				case 2:
					cartMenu(stock, client.getCart());
					break;

				case 3:
					profileMenu(client);
					break;

				case 4:
					break;

				default:
					System.out.println("invalid option");
					break;
				}
			}
		}
	}

}
