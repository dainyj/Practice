package q518_op;

/*세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)*/
/*입력 10 25 33 출력 sum : 68 avg : 22 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();

		int sum = i1 + i2 + i3;
		int avg = sum / 3;

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);

	}

}

 