package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Util.ConnectionUtil;
import model.Books;

public class BookDAO {
	public void addBook(Books user) throws Exception {
		String sql = "insert into book(name ,price,author_id,published_date)values(?,?,?,?)";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setInt(2, user.getPrice());
		pst.setInt(3, user.getAuthor_id());
		pst.setDate(4, Date.valueOf(user.getPublished_date()));

		int rows = pst.executeUpdate();
		System.out.println(rows);
		System.out.println("booksDAO->register:" + user);

	}

	public List<Books> listbook(Books user) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "select id,name,price,author_id,published_date from books";
		PreparedStatement pst = con.prepareStatement(sql);
		List<Books> booklist = new ArrayList<Books>();
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int price = rs.getInt("price");
			int authour_id = rs.getInt("author_id");
			Date published_date = rs.getDate("published_date");
			Books b = new Books();
			b.setId(id);
			b.setName(name);
			b.setPrice(price);
			b.setAuthor_id(authour_id);
			b.setPublished_date(published_date.toLocalDate());
			booklist.add(b);
		}
		System.out.println(booklist);
		for (Books b : booklist) {
			System.out.println(b);
		}
		return booklist;
	}
}
