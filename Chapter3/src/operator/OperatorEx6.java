package operator;

public class OperatorEx6 {

	public static void main(String[] args) {
		
		// 비트 연산자
		int num1 = 0B00001010; // 10
		int num2 = 0B00000101; // 5

		System.out.println(num1 & num2); // AND 연산 : 0
		System.out.println(num1 | num2); // OR 연산 : 15
		System.out.println(num1 ^ num2); // XOR 연산 : 15

		System.out.println(num2 << 1); // 10 (곱하기 2한 것과 같다)
		System.out.println(num2 << 2); // 20 (곱하기 2^2)
		System.out.println(num2 << 3); // 40( 곱하기 2^3)

		System.out.println(num2 >> 1); // 2 (나누기 2)
		System.out.println(num2 >> 2); // 1 (나누기 2^2)
	}

}
