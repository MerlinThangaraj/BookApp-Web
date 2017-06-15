<!DOCTYPE html>
<%@page import="model.Books"%>
<%@page import="java.util.List"%>
<%@page import="DAO.BookDAO"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Books</title>
</head>
<body>
	<h3>List Books</h3>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Price</th>
				<th>Published Date</th>
				<th>Author Name</th>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>core java</td>
				<td>RS.500</td>
				<td>2017-04-08</td>
				<td>Merlin</td>
			</tr>
			<tr>
				<td>2</td>
				<td>java</td>
				<td>RS.550</td>
				<td>2017-04-08</td>
				<td>Paula</td>
			</tr>
		</tbody>


	</table>
</body>
<% 
BookDAO bookDAO=new BookDAO();
List<Books> booklist=bookDAO.booklist();
out.println("Books:"+listbook);
%>
</html>