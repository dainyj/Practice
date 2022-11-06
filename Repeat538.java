package jungol;

import java.util.Scanner;

public class Repeat538 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("number? ");
			int inp = sc.nextInt();
			if (inp > 0) {
				System.out.println("positive integer");
			} else if (inp < 0) {
				System.out.println("negative number");
			} else

				break;
		}
	}

}
