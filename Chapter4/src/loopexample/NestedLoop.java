package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		// for: 구구단 출력
		int dan;
		int count;

		for (dan = 2; dan <= 9; dan++) {
			for (count = 1; count <= 9; count++) {
				System.out.println(dan + " X " + count + " = " + dan * count);
			}
			System.out.println();
		}

		// while: 구구단 출력
		int dan2 = 2;
		int count2 = 1;

		while (dan2 <= 9) {
			count2 = 1;
			while (count2 <= 9) {
				System.out.println(dan2 + " X " + count2 + " = " + dan2 * count2);
				count2++;
			}
			dan2++;
		}

	}

}
