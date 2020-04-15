package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();

		studentLee.studentName = "이순신";
		studentLee.address = "서울";

		studentLee.showStudentInfo();

		// studentKim 추가
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";

		studentKim.showStudentInfo();

		// 참조 변수의 값을 출력
		System.out.println(studentLee); // classpart.Student@5ebec15
		System.out.println(studentLee); // classpart.Student@5ebec15
	}

}
