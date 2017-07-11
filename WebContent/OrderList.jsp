<%@page import="java.util.List"%>
<%@page import="model.Order"%>
<%@page import="DAO.OrderDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>List of orders</h3>
<% 
	OrderDAO orderDAO=new OrderDAO();
	List<Order>orderlist=orderDAO.orderList();

	
	%>
	<table border="1">
<thead><tr>
<th>Id</th>
<th> User_id</th>
<th> book_id</th>
<th>status</th>
<th>quantity</th>
<th>order date</th>
</tr>
</thead>
<tbody>
	<%
	for(Order o:orderlist)
	{
		out.println("<tr>");
		out.println("<td>"+ o.getId()+"</td>");
	out.println("<td>"+ o.getUserId()+"</td>");
	out.println("<td>"+o.getBookId()+"</td>");
	out.println("<td>"+o.getStatus()+"</td>");
	out.println("<td>"+o.getQuantity()+"</td>");
	out.println("<td>"+o.getOrderDate()+"</td>");

	out.println("</tr>");
	}
	%>
</tbody>
</table>
</body>
</html>