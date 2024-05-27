package ch02;

public class BooleanExam {

	public static void main(String[] args) {
		// boolean은 true나 false을 값만 같는 타입
		// true는 참 / false 거짓을 나타낸다.
		// 조건문에 해당하는 분기를 담당한다.
		
		boolean stop = true ; 
		
		if(stop) {
			// stop값이 true일 때 처리되는 실행문
			System.out.println("차를 멈춥니다.");
		} else {
			// stop값이 false일 때 처리되는 실행문			
			System.out.println("차가 달립니다.");
		}

	}

}
