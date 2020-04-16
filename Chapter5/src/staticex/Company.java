package staticex;

public class Company {

	// 내부적으로 자기 자신 타입의 변수를 하나 생성.
	private static Company instance = new Company();

	// 외부에 오픈되는 생성자가 아니다.
	private Company() {
	}

	// 외부에서 인스턴스 생성과 상관 없이 외부에서 참조 할 수 있도록 static으로 해줌
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
