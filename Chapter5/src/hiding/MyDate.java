package hiding;

public class MyDate {

	// 1. public 다른 패키지에서도 접근 가능하게 하기 위해 public 사용
	// 기본 접근 지정 제어자는 같은 패키지 내에서만 사용을 허용한다.

	// 2. private
	private int day;
	private int month;
	private int year;

	private boolean isValid = true;

	// private 변수를 외부에서 set할 수 있도록 하는 public 메서드
	public void setDay(int day) {
		// this.day : 멤버 변수, day: 매개변수
		this.day = day;
	}

	// private 변수를 외부에서 get할 수 있도록 하는 public 메서드
	public int getDay() {
		return day;
	}

	// source의 getter setter로 생성 가능
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			isValid = false;
		} else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		if (isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일");
		} else {
			System.out.println("유효하지 않은 날짜입니다.");
		}

	}

}
