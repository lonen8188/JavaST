package ch12.threadtest;

public class TestExam {

	public static void main(String[] args) {
		// 주스레드(메인스레드) 
		// 새로 만든 스레드 객체를 생성하여 구현한다.
		Runnable tk = new Tesk(); //Runnable인터페이스 타입의 다형성
		
		Thread th = new Thread(tk); 
		//Thread 생성자를 호출하면 작업 스레드가 생성됨.

		//익명 구현 객체로 사용
		Thread th1 = new Thread(new Runnable() {
			
			@Override // 익명 구현 객체로 사용(인터페이스 사용법 참고)
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}); // ; 필수
		
		//실행
		th1.start(); //스레드 시작
		th1.stop(); //스레드 종료
		th1.suspend(); //일시 정지
		
		
	}

}
