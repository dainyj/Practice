/*10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 짝수 번째 
 * 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
 * 입력 10 20 25 66 83 7 22 90 1 100
*/
package q152_arr;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int odd = 0;
		int even = 0;

//		스캐너 입력
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

//		입력확인
		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
		}

//		짝수 홀수 분류
		for (int i = 0; i < inp.length; i++) {
			if (i % 2 == 0) { // 홀수 합 시작이 0이므로
				odd += inp[i];
			} else {// 짝수 합
				even += inp[i];
			}
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
