package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10]; // 배열 선언
		int total = 0;

		for (int i = 0, num = 1; i < arr.length; i++, num++) {
			arr[i] = num;
		}

		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);

		
		// 유효한 배열 값만 사용하기 위해 count 변수 사용
		double[] dArr = new double[5];
		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;

		double mtotal = 1;
		for (int i = 0; i < count; i++) {
			mtotal *= dArr[i];
		}

		System.out.println(mtotal);

	}

}
