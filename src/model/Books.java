package model;

import java.time.LocalDate;

public class Books {

	 private Integer id;
	 private String name;
	 private Integer price;
	 private int author_id;
	 private LocalDate published_date;
	  
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public LocalDate getPublished_date() {
		return published_date;
	}
	public void setPublished_date(LocalDate published_date) {
		this.published_date = published_date;
	}
	
	
	 @Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", price=" + price + ", author_id=" + author_id
				+ ", published_date=" + published_date + "]";
	}


}
