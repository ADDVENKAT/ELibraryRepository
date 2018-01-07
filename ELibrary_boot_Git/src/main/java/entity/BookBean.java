package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "E_BOOK")
public class BookBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String isbno;
	private String name;
	private String author;
	private String publisher;
	private int quantity;

	public BookBean() {
	}

	public BookBean(int id, String isbno, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.isbno = isbno;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbno() {
		return isbno;
	}

	public void setIsbno(String isbno) {
		this.isbno = isbno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
