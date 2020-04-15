package classpart;

public class Student {

	// 학생이라는 개체가 가지는 특성, 속성은 멤버 변수로 표현
	public int studentID;
	public String studentName;
	public String address;

	// 기능은 메서드로 구현한다.
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
}
