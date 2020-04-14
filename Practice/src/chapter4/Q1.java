package chapter4;

/*
 * 연산자와 두 수를 변수로 선언한 후 사칙연산이 수행되는 프로그램을 만들어 보세요.
 * if-else if-else, switch-case 두 방식으로 모두 구현해 봅니다.
 */
public class Q1 {

	public static void main(String[] args) {
		char op = '+';
		int num1 = 100;
		int num2 = 20;
		int result;

		// if-else로 구현
		if (op == '+') {
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + " = " + result);
		} else if (op == '-') {
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + " = " + result);
		} else if (op == '*') {
			result = num1 * num2;
			System.out.println(num1 + "X" + num2 + " = " + result);
		} else if (op == '/') {
			result = num1 / num2;
			System.out.println(num1 + "/" + num2 + " = " + result);
		} else {
			System.out.println("잘못된 연산자입니다.");
		}

		// switch-case로 구현
		switch (op) {
			case '+':
				result = num1 + num2;
				System.out.println(num1 + "+" + num2 + " = " + result);
				break;
			case '-':
				result = num1 - num2;
				System.out.println(num1 + "-" + num2 + " = " + result);
				break;
			case '*':
				result = num1 * num2;
				System.out.println(num1 + "X" + num2 + " = " + result);
				break;
			case '/':
				result = num1 / num2;
				System.out.println(num1 + "/" + num2 + " = " + result);
				break;
			default:
				System.out.println("잘못된 연산자입니다.");
		}
		
	}

}
