/*10개의 문자를 입력받아 마지막으로 입력받은 문자부터 
 * 첫 번째 입력받은 문자까지 차례로 출력하는 프로그램을 작성하시오.
 * 입력 A E C X Y Z c b z e
*/
package q150_arr;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = new char[10];
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0);
		}
		sc.close();
//	입력확인
		for (int i = 0; i < c.length; i++) {
//			System.out.print(c[i] + " ");
		}
//		System.out.println();
//	출력 거꾸로
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i] + " ");
		}
	}
}
