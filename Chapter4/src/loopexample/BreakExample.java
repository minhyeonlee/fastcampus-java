package loopexample;

public class BreakExample {

	public static void main(String[] args) {

		// 더해진 숫자가 100이 넘는 순간의 합과 그 때 까지 더해진 수

		int sum = 0;
		int num;
		for (num = 1;; num++) {

			sum += num;
			if (sum >= 100)
				break;
		}

		System.out.println(sum);
		System.out.println(num);

	}

}
