package q525_op;
/*3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.
(JAVA는 1이면 true, 0이면 false를 출력한다.)*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();

		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else {
			System.out.println("false");
		}

		if (n1 == n2 && n2 == n3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
