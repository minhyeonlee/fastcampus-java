package innerclass;

class Outer {

	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {

		int num = 100;
		// 메서드 안에 class 구현 : 지역 내부 클래스
		class MyRunnable implements Runnable {

			@Override
			public void run() {

				// 메서드의 지역변수가 자동으로 상수가 됨. 그래서 참조만 가능하다.
				// num += 10;
				// i = 200;
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);

			}

		}
		return new MyRunnable();
	}
}

public class LocalInnerClassTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);

		runnable.run();
	}

}
