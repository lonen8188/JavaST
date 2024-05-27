package ch10.trycatch.throwsexam;

import java.util.Scanner;

public class ThrowsExam {

	public static void main(String[] args) {
		// 예외를 호출한 곳으로 떠넘기는 것을 throws라고 한다.
		
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("찾을 클래스를 입력하세요");
			System.out.print(">>>");
			String input = in.next(); //키보드 입력값이 input 변수에 들어감
			findClass(input);//메서드 호출
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("Ctrl+f11로 다시 실행 할 수 있습니다.");
		}

	}

	private static void findClass(String input) throws ClassNotFoundException { // 호출 당하는 메서드
		// 클래스를 찾는 동작
		
		Class clazz = Class.forName(input) ;
		System.out.println("해당하는 클래스가 존재합니다.");		
		
		
		
		
	}

}
