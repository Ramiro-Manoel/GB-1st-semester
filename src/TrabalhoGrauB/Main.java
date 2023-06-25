package TrabalhoGrauB;

import java.util.Scanner;

public class Main {

	// asks if the user is a costumer or an employee, returns the number used in the
	// switch case at main.
	public static int checkUserType(int password) {

		Scanner scanner = new Scanner(System.in);
		int testPassword = 999999999;
		System.out.println("Would you like to use the progam as:" + "\n1 - Costumer" + "\n2 - Employee"
				+ "\n3 - leave the progam");

		int option = scanner.nextInt();

		switch (option) {
		case 1:
			return 1;

		case 2:
			System.out.println("Type the password: (type 0 to leave)");

			while (testPassword != password) {
				if (testPassword == 0) {
					return 0;
				}
				testPassword = scanner.nextInt();

				if (testPassword == 0) {
					return 0;
				}
				if (testPassword == password) {
					return 2;
				} else {
					System.out.println("Wrong password! try again");
				}
			}
			break;

		case 3:
			System.out.println("Thank you for using our progam!");
			return 3;

		}
		return 0;
	}

	// asks all the attributes for creating a client and returns it.
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

	// asks all the attributes for creating a book and returns it.
	public static Books createBook() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Whats the name of the book?");
		String name = scanner.nextLine();
		System.out.println("Whats the price of the book?");
		double price = scanner.nextDouble();
		System.out.println("Whats the description of the book?");
		scanner.nextLine();
		String desciption = scanner.nextLine();
		System.out.println("How many products are in the stock?");
		int quantity = scanner.nextInt();
		System.out.println("Whats the brand of the book?");
		scanner.nextLine();
		String brand = scanner.nextLine();
		System.out.println("Whats the indetifier of the book? (between 0 and 999)");
		int identifier = scanner.nextInt();
		System.out.println("Whats the author of the book?");
		scanner.nextLine();
		String author = scanner.nextLine();
		System.out.println("Is the book physical?" + "\n1 - yes" + "\n2 - no");
		boolean physical = false;
		switch (scanner.nextInt()) {
		case 1:
			physical = true;
		case 2:
			physical = false;
		}

		System.out.println("Whats the number of pages?");
		int pages = scanner.nextInt();
		return new Books(name, price, desciption, quantity, brand, identifier, author, physical, pages);
	}

	// asks all the attributes for creating a home appliance and returns it.
	public static HomeAppliances createHomeAppliances() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Whats the name of the home appliance?");
		String name = scanner.nextLine();
		System.out.println("Whats the price of the home appliance?");
		double price = scanner.nextDouble();
		System.out.println("Whats the description of the home appliance?");
		scanner.nextLine();
		String desciption = scanner.nextLine();
		System.out.println("How many products are in the stock?");
		int quantity = scanner.nextInt();
		System.out.println("Whats the brand of the home appliance?");
		scanner.nextLine();
		String brand = scanner.nextLine();
		System.out.println("Whats the indentifier of the home appliance? (between 0 and 999)");
		int identifier = scanner.nextInt();
		System.out.println("Whats the power of the home appliance?");
		int power = scanner.nextInt();

		return new HomeAppliances(name, price, desciption, quantity, brand, identifier, power);
	}

	// asks all the attributes for creating a clothing and returns it.
	public static Clothing createclClothing() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Whats the name of the clothing?");
		String name = scanner.nextLine();
		System.out.println("Whats the price of the clothing?");
		double price = scanner.nextDouble();
		System.out.println("Whats the description of the clothing?");
		scanner.nextLine();
		String desciption = scanner.nextLine();
		System.out.println("How many products are in the stock?");
		int quantity = scanner.nextInt();
		System.out.println("Whats the brand of the clothing?");
		scanner.nextLine();
		String brand = scanner.nextLine();
		System.out.println("Whats the indentifier of the clothing? (between 0 and 999)");
		int identifier = scanner.nextInt();
		System.out.println("Whats the fabric of the clothing?");
		scanner.nextLine();
		String fabric = scanner.nextLine();
		System.out.println("Whats the color of the clothing?");
		String color = scanner.nextLine();

		return new Clothing(name, price, desciption, quantity, brand, identifier, fabric, color);
	}

	// asks all the attributes for creating an electronic and returns it.
	public static Electronics createElectronic() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Whats the name of the eletronic?");
		String name = scanner.nextLine();
		System.out.println("Whats the price of the eletronic?");
		double price = scanner.nextDouble();
		System.out.println("Whats the description of the eletronic?");
		scanner.nextLine();
		String desciption = scanner.nextLine();
		System.out.println("How many products are in the stock?");
		int quantity = scanner.nextInt();
		System.out.println("Whats the brand of the eletronic?");
		scanner.nextLine();
		String brand = scanner.nextLine();
		System.out.println("Whats the indentifier of the eletronic? (between 0 and 999)");
		int identifier = scanner.nextInt();
		System.out.println("Whats the type of the eletronic?");
		scanner.nextLine();
		String type = scanner.nextLine();
		System.out.println("Whats the color of the eletronic?");
		String color = scanner.nextLine();

		return new Electronics(name, price, desciption, quantity, brand, identifier, type, color);
	}

	// method that shows the stock and gives all the options that a client have at
	// the stock
	public static boolean stockCostumerMenu(Stock stock, Cart cart) {

		Scanner scanner = new Scanner(System.in);
		int option = 0;

		while (option != 4) {
			if (stock.seeStock()) {

				System.out.println("\n options:" + "\n1 - See details of a product" + "\n2 - Add product in your cart"
						+ "\n3 - Filter by category" + "\n4 - leave");

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
					System.out.println("which category would you like to see?" + "\n1 - Boooks"
							+ "\n2 - Home appliances" + "\n3 - Clothing" + "\n4 - Electronics");
					switch (scanner.nextInt()) {
					case 1:
						stock.filter(1);
						break;
					case 2:
						stock.filter(2);
						break;
					case 3:
						stock.filter(3);
						break;
					case 4:
						stock.filter(4);
						break;
					}
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
		return true;
	}

	// method that shows the stock and gives all the options that the employee have
	// at the stock
	public static boolean stockEmployeeMenu(Stock stock) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;

		while (option != 6) {
			stock.seeStock();

			System.out.println("\n options:" + "\n1 - See details of a product" + "\n2 - Add product to stock"
					+ "\n3 - Remove product from stock" + "\n4 - Change the quantity of a product"
					+ "\n5 - Filter by category" + "\n6 - Leave");

			option = scanner.nextInt();

			switch (option) {
			case 1:
				System.out.println("Which product do you want to see the details?");
				System.out.println(stock.getStockList().get(scanner.nextInt()).Details());
				System.out.println("\nType \"ok\" to go back to the stock");
				scanner.next();
				break;

			case 2:
				System.out.println("Which class of product do you want to add?" + "\n1 - Book" + "\n2 - Home appliance"
						+ "\n3 - Clothing" + "\n4 - Eletronic" + "\n5 - Go back");

				switch (scanner.nextInt()) {
				case 1:
					stock.addProduct(createBook());
					System.out.println("Product added!\n");
					break;
				case 2:
					stock.addProduct(createHomeAppliances());
					System.out.println("Product added!\n");
					break;
				case 3:
					stock.addProduct(createclClothing());
					System.out.println("Product added!\n");
					break;
				case 4:
					stock.addProduct(createElectronic());
					System.out.println("Product added!\n");
					break;
				}
				System.out.println("Product(s) added to your cart\n");
				break;

			case 3:
				System.out.println("Are you sure you want to remove a product?" + "\n1 - yes" + "\n2 - no");
				switch (scanner.nextInt()) {
				case 1:
					System.out.println("what is the index of the product that you want to remove?");
					stock.rmvProduct(scanner.nextInt());
					System.out.println("Product has been removed\n");
					break;
				case 2:
					break;
				}
				break;

			case 4:
				System.out.println("What is the index of the product that you want to change the quantity?");
				int indexChange = scanner.nextInt();
				System.out.println("How many of this product are there in the stock?");
				stock.getStockList().get(indexChange).setQuantity(scanner.nextInt());
				System.out.println("Quantity has been changed\n");
				break;

			case 5:
				System.out.println("which category would you like to see?" + "\n1 - Boooks" + "\n2 - Home appliances"
						+ "\n3 - Clothing" + "\n4 - Electronics");
				switch (scanner.nextInt()) {
				case 1:
					stock.filter(1);
					break;
				case 2:
					stock.filter(2);
					break;
				case 3:
					stock.filter(3);
					break;
				case 4:
					stock.filter(4);
					break;
				}
				break;
			case 6:
				break;
			default:
				System.out.println("invalid option");
				break;
			}
		}
		return true;
	}

	// method that shows the cart and gives all the options that a client have at
	// the stock
	public static boolean cartMenu(Stock stock, Client client, OrderHistory orderHistory, int orderIndex) {

		Scanner scanner = new Scanner(System.in);
		int option = 0;

		while (option != 4) {
			if (client.getCart().SeeCart()) {

				System.out.println("\n options:" + "\n1 - See details of a product"
						+ "\n2 - Remove product of your cart" + "\n3 - Proceed to checkout" + "\n4 - Leave");
				option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("Which product do you want to see the details?");
					System.out.println(client.getCart().getShoppingList().get(scanner.nextInt()).Details());
					System.out.println("\nType \"ok\" to go back to the stock");
					scanner.next();
					break;

				case 2:
					System.out.println("Which product do you want to remove from your cart?");
					int productIndex = scanner.nextInt();
					System.out.println("How many of this products do you want to remove?");
					int amount = scanner.nextInt();
					for (int i = 0; i < amount; i++) {
						client.getCart().rmvProduct(productIndex, stock);
					}
					System.out.println("Product(s) removed from your cart\n");
					break;

				case 3:
					client.getCart().SeeCart();
					System.out.println("Are you sure you want to checkout?" + "\n1 - yes" + "\n2 - no");
					switch (scanner.nextInt()) {
					case 1:
						orderHistory.addOrder(puchaseMenu(client));
						System.out.printf("You will have to pay: R$%.2f during %d months",
								client.getCart().finalValue()
										/ orderHistory.getOrderHistory().get(orderIndex).getPayment().getInstallments(),
								orderHistory.getOrderHistory().get(orderIndex).getPayment().getInstallments());
						System.out.println("\ntotal to pay: R$" + client.getCart().conclude());
						System.out.println("\nThank you for buying with us!\n");
						orderIndex++;
						break;
					case 2:
						break;
					}

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
		return true;
	}

	// method that creates the order object for a client and returns it, creating a
	// payment object
	public static Order puchaseMenu(Client client) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("what is the payment method?" + "\n1 - Pix" + "\n2 - Credit card" + "\n3 - Bank slip");
		switch (scanner.nextInt()) {
		case 1:
			Order order1 = new Order(client, new Payment(client.getCart().finalValue(), 1, "pix"));
			order1.passProducts(client.getCart());
			return order1;
		case 2:
			System.out.println("How many installments?");
			Order order2 = new Order(client,
					new Payment(client.getCart().finalValue(), scanner.nextInt(), "Credit card"));
			order2.passProducts(client.getCart());
			return order2;
		case 3:
			System.out.println("How many installments?");
			Order order3 = new Order(client,
					new Payment(client.getCart().finalValue(), scanner.nextInt(), "Bank slip"));
			order3.passProducts(client.getCart());
			return order3;
		}
		return null;

	}

	// method that shows the name and the address of the client and let it change it
	public static boolean profileMenu(Client client) {

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
		return true;
	}

	// method that show all the orders that have been made and give the option to
	// delete the order you choose
	public static boolean seeOrderHistory(OrderHistory orderHistory) {

		Scanner scanner = new Scanner(System.in);

		if (orderHistory.seeOrderHistory()) {

			System.out.println("Options:" + "\n1 - Remove order from order history" + "\n2 - leave");

			switch (scanner.nextInt()) {

			case 1:
				System.out.println("Are you sure you want to remove an order?" + "\n1 - yes" + "\n2 - no");
				switch (scanner.nextInt()) {
				case 1:
					System.out.println("what is the index of the order that you want to remove?");
					orderHistory.rmvOrder(scanner.nextInt());
					System.out.println("Order has been removed\n");
					break;

				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		OrderHistory orderHistory = new OrderHistory();
		Stock stock = new Stock();
		int orderIndex = 0;
		int password = 123456;
		int option = 0;
		int user = 0;

		Books book = new Books();
		book.setQuantity(3);
		book.setPrice(10);
		stock.addProduct(book);

		while (user != 3) {

			user = checkUserType(password);
			switch (user) {
			case 0:
				break;
			case 1:
				Client client = createClient();
				option = 0;
				while (option != 4) {
					System.out.println("Costumer options: " + "\n1 - See stock" + "\n2 - See your cart"
							+ "\n3 - See your profile" + "\n4 - Leave");
					option = scanner.nextInt();

					switch (option) {

					case 1:
						stockCostumerMenu(stock, client.getCart());
						break;

					case 2:
						cartMenu(stock, client, orderHistory, orderIndex);
						break;

					case 3:
						profileMenu(client);
						break;

					case 4:
						break;

					default:
						System.out.println("Invalid option\n");
						break;
					}

				}
				break;

			case 2:
				option = 0;
				while (option != 4) {
					System.out.println("Employee options: " + "\n1 - See stock" + "\n2 - See order history"
							+ "\n3 - Change password" + "\n4 - Leave");
					option = scanner.nextInt();
					switch (option) {

					case 1:
						stockEmployeeMenu(stock);
						break;

					case 2:
						seeOrderHistory(orderHistory);
						break;

					case 3:
						System.out.println("Type the new password (must be only numbers and different of 0)");
						password = scanner.nextInt();
						System.out.println("Your password has been changed successfully\n");
						break;

					case 4:
						break;

					default:
						System.out.println("Invalid option");
						break;
					}

				}
			case 3:
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		}
	}
}