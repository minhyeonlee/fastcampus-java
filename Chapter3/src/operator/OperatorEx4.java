package operator;

public class OperatorEx4 {

	public static void main(String[] args) {

		// 단락 회로 평가
		int num1 = 10;
		int i = 2;

		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // 20, 4 예
		System.out.println(num1); // 20
		System.out.println(i); // 2: 앞의 값이 false여서 뒤의 식을 연산하지 않았다.

		System.out.println(value);

		int num2 = 10;
		int i2 = 2;

		boolean value2 = ((num2 = num2 + 10) < 10) || ((i2 = i2 + 2) < 10); // 20, 4 예
		System.out.println(num2); // 20
		System.out.println(i2); // 4

		System.out.println(value2);
	}

}
