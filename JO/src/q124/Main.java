package q124;
//		1~12사이 정수 입력 -> 해당 월의 날수 출력		

//   1  2  3  4  5  6  7  8  9 10 11 12
//	31 28 31 30 31 30 31 31 30 31 30 31

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
//		System.out.println(month);
		sc.close();
		
//		switch문 사용
		switch(month) {
		case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(31);
			break;
		case 2:
			System.out.println(28);
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(30);
			break;
		} // switch end
		
//      if문 사용
		if (0 < month && month <= 7) {
			if (month == 2) {
				System.out.println(28);
			} else if (month % 2 == 0) {
				System.out.println(30);
			} else if (month != 2 || month % 2 != 0) {
				System.out.println(31);
			}
		} else if (7 < month && month <= 12) {
			if (month % 2 == 0) {
				System.out.println(31);
			} else if (month % 2 != 0) {
				System.out.println(30);
			}
		} // for end

	} // Main end

}
