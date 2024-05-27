package ch05;

public class WhilePrintExam {

	public static void main(String[] args) {
		// while문은 정해진 회수 제한 없이 개발자가 false 처리를 해야 종료되는 반복문
		// while(true) 값이면 계속적으로 반복 , while(false) 값이면 중단
		
		int i = 1 ;
		while(i <= 10) {
			//true일때 실행되는 문.
			System.out.println("현재 값 : " + i);
			i++ ; 
		}

	}

}
