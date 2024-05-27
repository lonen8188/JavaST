package ch05;

import java.io.IOException;

public class WhileExam {

	public static void main(String[] args) throws Exception { // throws Exception : 키보드예외처리 
		// 키보드의 입력을 받아서 제어하는 실행문
		// System.in.read()메서드를 활용하여 유니코드를 이용한다.
		// 차량의 정속주행(크루즈)기능을 만들어 보겠다.
		// 1번을 누르면 가속, 2번을 누르면 감속, 3번을 누르면 중지코드
		
		boolean run = true; //while문의 실행-중지상태를 판단한다.
		int speed = 100 ; // 현재 시속
		int keyCode = 0 ; // 키보드로 입력되는 문자를 숫자로 판단
		
		while (run) { // run=true 일때 크루즈 기능이 활성화
			//true 일때 실행
			
			//메뉴 출력
			if(keyCode != 13 && keyCode !=10) { //엔터는 캐리지리턴+라인피드
				System.out.println("------------------------------");
				System.out.println("1. 가속 | 2. 감속 | 3. 크루즈 중지");
				System.out.println("------------------------------");
				System.out.print("선택 : ");
			} // 엔터가 아니면 -> 엔터치기 전까지의 유니코드값을 확인
			
			//키보드로 입력
			keyCode = System.in.read(); //Scanner와 같은 기능
			
			// 1번 입력
			if(keyCode == 49) { // 키보드로 1번을 누르면
				speed += 5 ; //5씩 증가
				System.out.println("현재속도 : " + speed);
			}else if (keyCode == 50) { //키보드로 2번을 누르면
				speed -= 5 ;
				System.out.println("현재속도 : " + speed);
			}else if (keyCode == 51) { //키도브 3번을 누르면
				run = false ; // 크루즈 run true -> false
				System.out.println("크루즈 기능이 종료 되었습니다.");
				System.out.println("현재 속도 : " + speed);
				System.out.println("안전운전 하세요!!!!");
			} // 1~3까지 처리실행문 종료
						
		} // 크루즈 while 종료
		
		System.out.println("프로그램이 종료되었습니다.");
		
	} // main()메서드 종료

} // class 종료
