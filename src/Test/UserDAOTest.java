package Test;

import DAO.UserDAO;
import model.Users;

public class UserDAOTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Users user = new Users();
		user.setName("Nandy");
		user.setEmail("merlinaayaaaaaaaa@gmail.com");
		user.setPassword("lusu");

		UserDAO userDAO = new UserDAO();
		userDAO.register(user);
	}

}
