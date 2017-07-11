package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.OrderDAO;
import model.Order;

@SuppressWarnings("serial")
@WebServlet("/orderservlet")

		public class OrderServelet extends HttpServlet {
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out=response.getWriter();
			String userid = request.getParameter("userid");
			String bookid = request.getParameter("bookid");
			//String status = request.getParameter("status");
			String quantity = request.getParameter("quantity");
			//String orderDate = request.getParameter("orderdate");

			
			int u =Integer.parseInt(userid);
			int b =Integer.parseInt(bookid);
			int q =Integer.parseInt(quantity);
			//LocalDate d=LocalDate.parse(orderDate);
			
			Order order = new Order();
	        order.setUserId(u);
	        order.setBookId(b);
	        //order.setStatus(status);
	        order.setQuantity(q);
	        //order.setOrderDate(d);
			out.println(order);
			OrderDAO orderDAO = new OrderDAO();
			try {
				orderDAO.bookOrder(order);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	}
