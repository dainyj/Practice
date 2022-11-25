package q519_op;

/*정수 2개를 입력받아서 첫 번째 수에는 100을 증가시켜 저장하고 두 번째 수는 10으로 나눈 나머지를 저장한 후 두 수를 차례로 출력하는 프로그램을 작성하시오.
*/
/*입력 20 35 출력 120 5*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		sc.close();
		
		int res1 = i1 + 100;
		int res2 = i2 % 10;

		System.out.print(res1 + " " + res2);
	}

}
