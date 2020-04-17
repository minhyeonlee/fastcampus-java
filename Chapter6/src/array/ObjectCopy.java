package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("나는 책이다1", "아무개");
		library[1] = new Book("나는 책이다2", "아무개");
		library[2] = new Book("나는 책이다3", "아무개");
		library[3] = new Book("나는 책이다4", "아무개");
		library[4] = new Book("나는 책이다5", "아무개");

		System.arraycopy(library, 0, copyLibrary, 0, 5);

		// 향상된 for문(처음부터 끝까지): Type variable
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}

		// 얕은 복사 : library만 바꿨는데 copyLibrary도 같이 바뀐 것을 확인할 수 있다.
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");

		for (Book book : library) {
			book.showBookInfo();
		}

		System.out.println("==================");

		for (Book book : copyLibrary) {
			book.showBookInfo();
		}
	}

}
