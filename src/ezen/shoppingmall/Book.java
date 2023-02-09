package ezen.shoppingmall;

public class Book extends Item {
	
	private String author;
	private int isbn;
	
	public Book() {}
	
	public Book(int id, String name, int price, String author, int isbn) {
		super(id, name, price);
		this.author = author;
		this.isbn = isbn;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return super.toString() + "\n저자 : " + author + "\n일련번호 : " + isbn;
	}
	
	
}
