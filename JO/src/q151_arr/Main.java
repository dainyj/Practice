/*5개의 정수를 입력받은 후 첫 번째 세 번째 다섯 번째 입력받은 
 * 정수의 합을 출력하는 프로그램을 작성하시오.
입력 15 20 33 10 9
*/
package q151_arr;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[5];
//	입력
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();
//	입력확인
		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
		}
//	합계산 1,3,5->0,2,4
		int sum = 0;
		for (int i = 0; i < inp.length; i++) {
			if (i % 2 == 0) {
				sum += inp[i];
			}
		}
		System.out.println(sum);

	}
}
