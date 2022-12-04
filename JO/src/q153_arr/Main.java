/*100개의 정수를 입력받을 수 있는 배열을 선언한 후 정수를 차례로 
 * 입력 받다가 -1이 입력되면 입력을 중단하고 -1을 제외한 마지막 세 개의 
 * 정수를 출력하는 프로그램을 작성하시오. (입력받은 정수가 -1을 제외하고 
 * 3개 미만일 경우에는 -1을 제외하고 입력받은 정수를 모두 출력한다.)
 * 입력 30 20 10 60 80 -1
 * 출력 10 60 80
*/
package q153_arr;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[100];
		int inum = 0;
//		입력 : -1이되면 입력중지
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
//			System.out.print(inp[i] + " ");
			if (inp[i] == -1) { //입력중지
//				System.out.println(i);
				inum = i; // inp[i] = -1 일 때의 i 값
				sc.close();
				break;
			}
		}
//		System.out.println(inum);

//		출력
		if (inum < 3) { // inp[i] = -1일 때 의 i가 3보다 작을 때
			for (int i = 0; i < inum; i++) {
				System.out.print(inp[i] + " ");
			}
		} else {
			for (int i = inum - 3; i < inum; i++) {
				System.out.print(inp[i] + " ");
			}
		}
	}
}
