package Test;

import java.time.LocalDate;

import model.Order;

public class OrderDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.setUserId(3);
		order.setBookId(3);
		order.setQuantity(1);
		order.setStatus("delievered");
		order.setOrderDate(LocalDate.now());
		System.out.println(order);
	}

}
