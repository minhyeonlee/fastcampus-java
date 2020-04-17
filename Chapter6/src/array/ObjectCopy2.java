package array;

public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("나는 책이다1", "아무개");
		library[1] = new Book("나는 책이다2", "아무개");
		library[2] = new Book("나는 책이다3", "아무개");
		library[3] = new Book("나는 책이다4", "아무개");
		library[4] = new Book("나는 책이다5", "아무개");

		// 깊은 복사
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();

		for (int i = 0; i < library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}

		// 원본을 바꾼다.
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");

		for (Book book : library) {
			book.showBookInfo();
		}

		System.out.println("================");

		// library의 내용이 변경 되었지만, copyLibrary의 내용은 그대로인것을 확인할 수 있다.
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}

	}

}
