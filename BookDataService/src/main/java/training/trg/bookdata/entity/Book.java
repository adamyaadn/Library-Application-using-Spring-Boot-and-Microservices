package training.trg.bookdata.entity;


public class Book {
	private int bookId;
	
	private int publisherId;
	
	private int authId;
	private String name;
	private float price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, int publisherId, int authId, String name, float price) {
		super();
		this.bookId = bookId;
		this.publisherId = publisherId;
		this.authId = authId;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", publisherId=" + publisherId + ", authId=" + authId + ", name=" + name
				+ ", price=" + price + ", getBookId()=" + getBookId() + ", getPublisherId()=" + getPublisherId()
				+ ", getAuthId()=" + getAuthId() + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
