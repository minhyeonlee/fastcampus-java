package variable;

public class CharTest {

	public static void main(String[] args) {

		char ch = 'A';
		System.out.println(ch); // A
		System.out.println((int) ch); // 65

		int iCh = 66;
		System.out.println(iCh); // 66
		System.out.println((char) iCh); // B

		char hangeul = '\uAC00'; // unicode는 2byte를 사용하여 저장
		System.out.println(hangeul); // 가

	}

}
