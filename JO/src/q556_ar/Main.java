package q556_ar;
/*정수 10 개를 저장할 수 있는 배열을 만들어서 1 부터 10 까지를 대입하고 차례대로 출력하는 프로그램을 작성하시오.
출력 1 2 3 4 5 6 7 8 9 10*/

public class Main {
	public static void main(String[] args) {
		int ar[]={1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
