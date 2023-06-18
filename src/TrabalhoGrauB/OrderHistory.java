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
	
	@Override
	public String toString() {
		return "OrderHistory [orderHistory=" + orderHistory + "]";
	}

	public boolean addOrder(Order order) {
		this.orderHistory.add(order);
		return true;
	}

	public boolean rmvOrder(Order order) {
		this.orderHistory.remove(order);
		return true;
	}
	
	public boolean rmvOrder(int index) {
		this.orderHistory.remove(index);
		return true;
	}
	
	public boolean seeOrderHistory() {
		if(orderHistory.isEmpty()) {
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
