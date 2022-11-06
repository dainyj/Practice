package jungol;

import java.util.Scanner;

public class Repeat539 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		for (int i = 1; i > 0; i++) {
			int inp = sc.nextInt();
			int res1 = inp + sum;
			sum = res1;
			if (inp < 100) {
//				System.out.print(i + "\s");
//				System.out.print(inp + "\s");
//				System.out.print(sum + "\s");
//				System.out.println(res1);
//				System.out.printf("%.1f\n", (double) res1 / i);
			} else if (inp >= 100) {
				System.out.println(res1);
				System.out.printf("%.1f\n", (double) res1 / i);

				sc.close();
				break;
			}
		}
	}
}
