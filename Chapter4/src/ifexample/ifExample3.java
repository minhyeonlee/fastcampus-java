/* 
 * 성적에 따라 학점 부여하기
 * 100-90점 : A
 * 89-80점 : B
 * 79-70점 : C
 * 69-60점 : D
 * 59이하: F
 * 점수를 입력 받아 학점을 출력 하세요.  
 */

package ifexample;

import java.util.Scanner;

public class ifExample3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int score = scanner.nextInt();
		char grade;

		if (90 <= score) {
			grade = 'A';
		} else if (80 <= score) {
			grade = 'B';
		} else if (70 <= score) {
			grade = 'C';
		} else if (60 <= score) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("점수: " + score);
		System.out.println("학점: " + grade);
	}

}
