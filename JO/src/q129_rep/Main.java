/*삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y' 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.
(넓이는 반올림하여 소수 첫째자리까지 출력한다.)
입출력 예​
Base = 11
Height = 5
Triangle width = 27.5
Continue? Y
Base = 10
Height = 10
Triangle width = 50.0
Continue? N

*/
package q129_rep;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int base = sc.nextInt();
			int height = sc.nextInt();
			System.out.print("Base = ");
			System.out.print("Height = ");
			System.out.printf("Triangle width = %.1f\n", (float) (base * height) / 2);
			System.out.print("Continue? ");
			char yn = sc.next().charAt(0);
			if (yn != 'Y' && yn != 'y') {
				sc.close();
				break;
			}
		}
	}
}
