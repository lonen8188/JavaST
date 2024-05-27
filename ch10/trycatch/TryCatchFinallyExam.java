package ch10.trycatch;

import java.util.Scanner;

public class TryCatchFinallyExam {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String data1 = null ;
		String data2 = null ;
		
		try {
		System.out.println("=====================");
		System.out.println("숫자 2개를 입력하세요");
		System.out.print("숫자 1(정수) : ");
		data1 = in.next();
		System.out.print("숫자 2(정수) : ");
		data2 = in.next();
		int value1 = Integer.parseInt(data1); //문자를 숫자로 변환
		int value2 = Integer.parseInt(data2); // 여기서 예외 발생가능
		System.out.println(data1 + " + " + data2 + " = " + (value1 + value2)  );
		
		
		}catch(NumberFormatException e) { // 숫자형식 변환 예외처리
			System.out.println("숫자형식으로 입력하셔야 됩니다.");
			//e.printStackTrace(); //로그 출력
		}finally { //항상 실행용
			System.out.println("다시 실행은 Ctrl+ F11로 가능합니다.");
		}
		
		
		
		
		
		
		
	}
}
