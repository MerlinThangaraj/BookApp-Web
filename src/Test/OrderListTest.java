package Test;

import java.time.LocalDate;

import DAO.OrderDAO;
import model.Order;

public class OrderListTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.setUserId(4);
		order.setBookId(4);
		order.setQuantity(1);
		order.setStatus("cancelled");
		order.setOrderDate(LocalDate.now());
		OrderDAO orderDAO = new OrderDAO();
		orderDAO.orderList(order);
	}

}
