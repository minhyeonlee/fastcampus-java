package array;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];

		// 책이 5권 생기려면 각각 new 해줘야함
		library[0] = new Book("나는 책이다1", "아무개");
		library[1] = new Book("나는 책이다2", "아무개");
		library[2] = new Book("나는 책이다3", "아무개");
		library[3] = new Book("나는 책이다4", "아무개");
		library[4] = new Book("나는 책이다5", "아무개");

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]); // array.Book@668bc3d5 등 class name + address가 출력
			library[i].showBookInfo(); // Book의 메서드를 사용해서 Book 정보 출력
		}
	}

}
