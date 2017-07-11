package Test;

import DAO.UserDAO;
import model.Users;

public class UsersLoginTest {
	public static void main(String[] args) throws Exception {
		UserDAO userDAO = new UserDAO();
		String email = "paulamerlin1977022@gmail.com";
		String password = "merlin97";
		Users user = userDAO.login(email, password);
		System.out.println(user);
	}

}
