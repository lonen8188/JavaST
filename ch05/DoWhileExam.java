package ch05;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// do{ 실행문;  } while ( 조건문:t/f );
		// do while문은 일단 실행문을 1번은 무조건 처리 후 판단
		
		System.out.println("채팅프로그램에 오신 것을 환영합니다.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요!! ");
		
		Scanner in = new Scanner(System.in); // 스캐너 객체를 in에 연결
		String inputString ; // 키보드로 입력된 문자열을 저장
		
		do {
			// 일단 실행되는 문
			System.out.print(">>>"); //커서모양
			inputString = in.nextLine() ; // 문자열을 입력 받는다.(띄어쓰기 포함)
			System.out.println("전송값 : " + inputString);
						
		} while (!inputString.equals("q")); // 입력값이 q가 아니면(!) 위로올라가 do문을 실행
		System.out.println("-------------------");
		System.out.println("채팅프로그램 정상 종료");
		
		
		
		
		
	}

}
