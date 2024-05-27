package ch05;

public class BreakExam {

	public static void main(String[] args) {
		// 반복문이나 switch문에서 break처리를 하면 실행 중지되는 문법
		
		int i = 0 ; 
		while(true) { // while true 처리가 되기 때문에 무한 반복 된다.
			int num = (int) (Math.random()*45) + 1 ; // 1~45까지 랜덤 값이 num에 저장
			System.out.println("오늘에 로또번호 : " + num);
			i++ ; // i = i + 1(1씩 증가처리용 코드)
			if(i == 6) { //로또번호 6번 출력 이후 코드
				System.out.println("로또 프로그램 종료");
				break; // 프로그램 강제 종료용 코드
			}
		}

	}

}
