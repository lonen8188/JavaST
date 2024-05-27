package ch07;

import java.util.Scanner;

public class KoreanExam {

	public static void main(String[] args) {
		// Korean 객체를 활용하는 연습
		Scanner in = new Scanner(System.in);
		System.out.print("이름 입력 >>>>>>");
		String name = in.next(); //키보드로 이름 입력
		System.out.print("주민번호입력 >>>>>>");
		String ssn = in.next(); //키보드로 이름 입력
				
		Korean k1 = new Korean(name, ssn);
		System.out.println("이름 : " + k1.name);
		System.out.println("주민번호 : " + k1.ssn);
		System.out.println("국적 : " + k1.nation);
	}

}
