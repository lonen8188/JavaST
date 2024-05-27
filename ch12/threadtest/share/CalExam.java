package ch12.threadtest.share;

public class CalExam {

	public static void main(String[] args) {
		// 2명의 사용자가(user1, user2) 계산기 객체(Calculator)를 동시에 사용하는 경우 테스트
		Calculator cal = new Calculator(); // 계산기 객체
		//Calculator cal1 = new Calculator();
		User1 user1 = new User1();			//사용자1 객체(스레드)
		User2 user2 = new User2(); 			//사용자2 객체(스레드)

		
		user1.setCalculator(cal); //계산기 객체와 사용자1객체 연결 (매개값의 다형성)
		user1.start(); // 스레드 실행
		
		user2.setCalculator(cal);
		user2.start();
	}

}
