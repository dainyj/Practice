package q615;
/*두 명의 이름과 국어, 영어 점수를 입력받아 과목별 점수의 평균을 구하여 출력하는 프로그램을 작성해 보시오.
(이름은 20자 이하이고 평균의 소수점 이하는 버림한다.)*/

import java.util.Scanner;

class student {
	private String name;
	private int kor;
	private int eng;

	public student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}
	
	public void getkor() {
//		return kor;
	}
	
	public void geteng() {
//		return eng;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}

}
