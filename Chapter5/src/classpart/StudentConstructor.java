package classpart;

public class StudentConstructor {

	// private : 클래스 내부에서만 사용 가능하다. 클래스의 외부에서 참조가 불가 
	private int studentID; 
	public String studentName;
	public String address;

	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}

	// default constructor 직접 구현
	public StudentConstructor() {
	}

	// name만 초기화 하는 constructor
	public StudentConstructor(String name) {
		studentName = name;

	}

	// name과 id를 초기화 하는 constructor
	public StudentConstructor(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음"; // 값을 받지 않고 초기화
	}
}
