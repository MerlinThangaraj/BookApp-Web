package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Util.ConnectionUtil;
import model.Order;

public class OrderDAO {
	public void bookOrder(Order order) throws Exception {
		String sql = "insert into users (user_id,book_id,quantity,status,order_date) values (?,?,?,?)";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, order.getUserId());
		pst.setInt(2, order.getBookId());
		pst.setInt(3, order.getQuantity());
		pst.setString(4, order.getStatus());
		pst.setDate(5, Date.valueOf(order.getOrderDate()));

		int rows = pst.executeUpdate();
		System.out.println(rows);
		System.out.println("OrderDAO->register:" + order);
	}

//public static void main(String[] args) throws Exception {


	 public List<Order> orderList() throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "select user_id, book_id,quantity,status,order_date from orders";
		PreparedStatement pst = con.prepareStatement(sql);
		List<Order> orderlist = new ArrayList<Order>();
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			int userId=rs.getInt("user_id");
			int bookId=rs.getInt("book_id");
			String Status=rs.getString("status");
			int quantity=rs.getInt("quantity");
			Date OrderDate = rs.getDate("order_date");
			Order o = new Order();
			o.setUserId(userId);
			o.setBookId(bookId);
			o.setQuantity(quantity);
			o.setStatus(Status);
			o.setOrderDate(OrderDate.toLocalDate());
			orderlist.add(o);
		}
		System.out.println(orderlist);
		for (Order o : orderlist) {
			System.out.println(o);
		}
		return orderlist;

}
}

