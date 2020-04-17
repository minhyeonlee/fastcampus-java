package chapter6;

public class Book {

	private String bookName;
	private String author;

	// constructor
	public Book() {}

	public Book(String name) {
		this.bookName = name;
		this.author = author;
	}

	// getter, setter

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}

}
