package q560_array;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int i = 0;
		for (i = 1; i < inp.length; i++) {
			int max = inp[0];
			int min = inp[0];
			inp[i] = sc.nextInt();
			if (inp[i] > max) {
				max = inp[i];
			} else if (inp[i] < min) {
				min = inp[i];
			}

			System.out.println(max);
			System.out.println(min);
		}
		sc.close();
	}

}
