package loopexample;

public class DoWhileExample1 {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;

		while (num <= 10) {
			sum += num;
			num++;
		}

		System.out.println(sum); // 55
		System.out.println(num); // 11

	}

}
