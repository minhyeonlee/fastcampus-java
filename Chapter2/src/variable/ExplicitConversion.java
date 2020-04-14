package variable;

public class ExplicitConversion {

	public static void main(String[] args) {

		int i = 1000;
		byte bNum = (byte) i; // 데이터의 유실 발생
		System.out.println(bNum); // -24가 나온다

		double dNum1 = 1.2;
		float fNum = 0.9F;

		int iNum1 = (int) dNum1 + (int) fNum;
		int iNum2 = (int) (dNum1 + fNum);

		System.out.println(iNum1); // 1 (1 + 0)
		System.out.println(iNum2); // 2 (1.2 + 0.9)를 형변환
	}

}
