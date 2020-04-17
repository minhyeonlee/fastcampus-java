package array;

public class Book {

	private String title;
	private String author;
	
	
	// default constructor
	public Book() {}

	// constructor
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// getter, setter 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(title + ", " + author); 
	}
	
}
