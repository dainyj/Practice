/*100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.*/
package q544_rep2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		int sum=0;
		
		for(int i=inp; i<=100;i++) {
		sum+=i;
		}
		System.out.println(sum);
	}

}
