/*
 * 다음 다이아몬드를 출력해 보세요.
 *    *
 *   ***
 *  *****
 * *******
 *  *****
 *   ***
 *    *
 */
package chapter4;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i += 2) {
			for (int j = 1; j <= (n - i) / 2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = n-2; i >= 1; i-=2) {
			for (int j = 1; j <= (n - i) / 2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
