package variable;

public class IntegerTest {

	public static void main(String[] args) {

		byte bs = -128; // -128 ~ 127 표현
		System.out.println(bs);

		// int: out of range error
		// int ival = 12345678900;

		// java에서 숫자는 4byte로 handling한다. 뒤에 L을 붙여주면된다.
		// long lval = 12345678900;
		long lval = 12345678900L;

	}

}
