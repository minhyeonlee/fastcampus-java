package operator;

public class OperatorEx1 {

	public static void main(String[] args) {

		int num1 = -10;
		int num2 = -20;

		// + 연산자는 부호를 유지한다.
		System.out.println(+num1); // -10
		System.out.println(+num2); // -20

		// - 연산자는 부호를 바꾼다.
		System.out.println(-num1); // 10
		System.out.println(-num2); // 20

		// 대입 연산자를 사용해야 값이 실제로 바뀜
		num1 = -num1;
		System.out.println(num1); // 10
	}

}
