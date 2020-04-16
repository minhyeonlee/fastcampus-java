package staticex;

public class StudentIDTest {

	public static void main(String[] args) {

		// 생성 될 때 마다 증가(static변수/method는 class 이름으로 참조한다.)
		Student studentLee = new Student("Lee");
		System.out.println(Student.getSerialNum());

		Student studentKim = new Student("Kim");
		System.out.println(Student.getSerialNum());

		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());

	}

}
