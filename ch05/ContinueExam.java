package ch05;

public class ContinueExam {

	public static void main(String[] args) {
		// countinue문은 반복문을 종료하지 않고 계속 반복문을 수행
		// for문의 증감식 또는 while문의 조건식으로 이동
		
		for(int i = 1 ; i<=10 ; i++) { // 1~10까지 증가되는 반복문
			if( i%2 != 0) { //짝수가 아닐때 
				System.out.println("짝수가 아님 -> 홀수 일때");
				continue; //
				// System.out.println("짝수가 아님 -> 홀수 일때"); countinue문 아래 실행안됨
			} //짝수가 아닐때 처리되는 if문 종료
			System.out.println("i 값 반복 출력 테스트용 : " + i);
		}
	}

}
