package hiding;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date = new MyDate();

		// date.day = 10;
		// date.month = 7;
		// date.year = 2020;

		// private 멤버변수에 public메서드를 사용해서 접근
		date.setYear(2020);
		date.setMonth(10);
		date.setDay(10);

		date.showDate();

	}

}
