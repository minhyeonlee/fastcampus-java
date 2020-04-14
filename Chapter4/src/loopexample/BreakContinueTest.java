package loopexample;

public class BreakContinueTest {

	public static void main(String[] args) {
		/* 구구단을 출력할 때 짝수 단만 출력하면서 단보다 곱하는 수가 작거나 같을 때까지만 출력하세요. */

		int dan;
		int count;

		for (dan = 1; dan <= 9; dan++) {
			if (((dan % 2)) != 0)
				continue;

			for (count = 1; count <= 9; count++) {
				if (count > dan)
					break;
				System.out.println(dan + " X " + count + " = " + dan * count);
			}

			System.out.println();
		}

	}

}
