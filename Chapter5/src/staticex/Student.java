package staticex;

public class Student {

	// static 변수는 private로 외부에서 접근할 수 없도록 함.
	private static int serialNum = 1000;
	private int studentID;
	public String studentName;
	public String address;

	// 생성자가 불릴 때마다 serialNum이 증가한다.
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}

	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
		serialNum++;
		studentID = serialNum;
	}

	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}

	public String getStudentName() {
		return studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	// static 변수를 외부에서 get, set할 수 있도록 한다.
	// static 메서드 안에서 인스턴스 변수는 사용할 수 없다. -> 인스턴스가 없어도 static은 사용할 수 있음.
	// 인스턴스 변수는 인스턴스가 없으면 메모리에 올라가지 않는다.
	// static 변수를 일반 메서드에는 사용 가능.
	public static int getSerialNum() {
		int i = 0; // 지역 변수
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
