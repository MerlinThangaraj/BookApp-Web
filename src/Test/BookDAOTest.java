package Test;

import java.time.LocalDate;

import model.Books;

public class BookDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books book = new Books();
		book.setName("Merlin");
		book.setPrice(200);
		book.setAuthor_id(2);
		book.setPublished_date(LocalDate.now());
		System.out.println(book);

	}

}
