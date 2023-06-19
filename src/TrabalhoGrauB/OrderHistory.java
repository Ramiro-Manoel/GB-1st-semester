package TrabalhoGrauB;

import java.util.ArrayList;

public class OrderHistory {

	private ArrayList<Order> orderHistory = new ArrayList<>();

	//constructor (doesn't need attributes)
	public OrderHistory() {
		super();
	}

	//getters and setters
	public OrderHistory(ArrayList<Order> orderHistory) {
		super();
		this.orderHistory = orderHistory;
	}

	public ArrayList<Order> getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(ArrayList<Order> orderHistory) {
		this.orderHistory = orderHistory;
	}

	//ToString
	@Override
	public String toString() {
		return "OrderHistory [orderHistory=" + orderHistory + "]";
	}

	// adds an orders and adds it to the history. Returns true
	public boolean addOrder(Order order) {
		this.orderHistory.add(order);
		return true;
	}

	// remove an order from the history, receiving order to delete it. Returns true
	public boolean rmvOrder(Order order) {
		this.orderHistory.remove(order);
		return true;
	}

	// remove an order from the history, receiving the index of the order to delete
	// it. Returns true
	public boolean rmvOrder(int index) {
		this.orderHistory.remove(index);
		return true;
	}

	// shows all the orders in the orderHistory and return true. If there's no
	// orders in the history, shows a message saying that is empty and return false
	public boolean seeOrderHistory() {
		if (orderHistory.isEmpty()) {
			System.out.println("There are no orders in the history");
			return false;
		} else {
			System.out.println("Stock:");
			for (Order e : orderHistory) {
				System.out.println(orderHistory.indexOf(e) + " - ");
				e.orderInfo();
			}
			return true;
		}
	}
}
