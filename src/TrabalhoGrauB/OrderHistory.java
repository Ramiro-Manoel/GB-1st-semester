package TrabalhoGrauB;

import java.util.ArrayList;

public class OrderHistory {

	private ArrayList<Order> orderHistory = new ArrayList<>();

	public OrderHistory() {
		super();
	}

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

	public boolean addOrder(Order order) {
		this.orderHistory.add(order);
		return true;
	}

	public boolean rmvOrder(Order order) {
		this.orderHistory.remove(order);
		return true;
	}
}
