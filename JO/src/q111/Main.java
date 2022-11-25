/*국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서 
 * 총점과 평균을 구하는 프로그램을 작성하시오. 
 * (단 평균의 소수점 이하는 버림 한다.)
70 95 63 100
*/
package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		for (int i = 1; i <= 4; i++) {
			int n = sc.nextInt();
//			System.out.print(n + " ");
			sum += n;
			avg = sum / i;
		}
		sc.close();
		System.out.println("sum "+sum);
		System.out.println("avg "+avg);
	}
}
