package q113_op;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int l = sc.nextInt();
		int width = w + 5;
		int length = l * 2;
		int area = width * length;
		System.out.println("width = " + width);
		System.out.println("length = " + length);
		System.out.println("area = " + area);
	}
}
