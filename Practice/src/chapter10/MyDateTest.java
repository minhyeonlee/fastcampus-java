package chapter10;

class MyDate {
	int day;
	int month;
	int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// hashCode() 메서드 재정의
	@Override
	public int hashCode() {
		String result = Integer.toString(year) + Integer.toString(month) + Integer.toString(day);
		return Integer.parseInt(result);
	}

	// equals() 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate date = (MyDate) obj;
			if (this.year == date.year & this.month == date.month & this.day == date.day) {
				return true;
			}
		}
		return false;
	}

}

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(10, 12, 2020);
		MyDate date2 = new MyDate(10, 12, 2020);

		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}

}