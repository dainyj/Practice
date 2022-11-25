package q557_ar;
/*10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.
입력 A B C D E F G H I J 출력 A D G*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ar[] = new char[10];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.next().charAt(0);		
			
		}

		for (int j = 0; j < 7; j += 3) {
			System.out.print(ar[j] + " ");
		}
		sc.close();
	}
}
