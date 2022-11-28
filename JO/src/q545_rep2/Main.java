/*10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.*/
package q545_rep2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int three = 0;
		int five = 0;
		for (int i = 0; i < 10; i++) {
			int inp = sc.nextInt();
//			System.out.print(inp + " ");
			if (inp % 3 == 0) {
				three++;
			}
			if (inp % 5 == 0) {
				five++;
			}
		}
		sc.close();

		System.out.println("Multiples of 3 : " + three);
		System.out.println("Multiples of 5 : " + five);
	}
}
