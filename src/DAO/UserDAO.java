package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.ConnectionUtil;
import model.Users;


public class UserDAO {
	public void register(Users user) throws Exception {
		String sql = "insert into users (name ,email,password) values (?,?,?)";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmail());
		pst.setString(3, user.getPassword());

		int rows = pst.executeUpdate();
		System.out.println(rows);
		System.out.println("UserDAO->register:" + user);
	}

	public  Users login(String email, String password) throws Exception {
		String sql = "select id,name,email,password from users where email=? and password=?";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement Pst = con.prepareStatement(sql);

		Pst.setString(1, email);
		Pst.setString(2, password);
		Users user = null;
		ResultSet rs = Pst.executeQuery();
		if (rs.next()) {
			int id = rs.getInt("id");
			String Name = rs.getString("name");
			String Email = rs.getString("email");
			String Password = rs.getString("password");

			user = new Users();
			user.setId(id);
			user.setName(Name);
			user.setEmail(Email);
			user.setPassword(Password);
		}
		return user;

	}

}
