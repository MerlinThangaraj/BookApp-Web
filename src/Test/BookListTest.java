package Test;

import java.time.LocalDate;

import DAO.BookDAO;
import model.Books;

public class BookListTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Books book = new Books();
		book.setName("Merlin");
		book.setPrice(200);
		book.setAuthor_id(2);
		book.setPublished_date(LocalDate.now());
		BookDAO bookDAO = new BookDAO();
		bookDAO.listbook(book);

	}

}
