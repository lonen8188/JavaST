package ch04;

import java.util.Scanner;

public class ScannerStringExam {

	public static void main(String[] args) {
		// 키보드로 입력받는 내용이 문자열일 경우에는 next(), nextLine()을 사용한다.
		
		Scanner in = new Scanner(System.in); //스케너 객체를 생성하여 in변수에 연결
		
		System.out.print("이름을 입력하세요 : ");
		String name = in.nextLine() ; 
		System.out.print("나이를 입력하세요 : ");
		String age = in.nextLine() ;
		System.out.print("이메일을 입력하세요 : ");
		String email = in.nextLine() ;
		
		System.out.println(name + "님 해킹 당하신것을 축하드립니다. ㅋㅋㅋ");
		System.out.println("당신의 나이가 " + age + "이군요");
		System.out.println(email+ "주소 잘 사용하겠습니다. 감사드립니다.");

	}

}
