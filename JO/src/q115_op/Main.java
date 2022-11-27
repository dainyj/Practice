package q115_op;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] phy = new int[2][2];
		for (int i = 0; i < phy.length; i++) {
			for (int j = 0; j < phy.length; j++) {
				phy[i][j] = sc.nextInt();
//				System.out.print(physical[i][j]+" ");
			}
		}
		sc.close();
		boolean h = phy[0][0] > phy[1][0] ? true : false;
		boolean w = phy[0][1] > phy[1][1] ? true : false;
//		System.out.println(h + " " + w);

		if (h == true && w == true) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
