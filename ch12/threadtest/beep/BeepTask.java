package ch12.threadtest.beep;

import java.awt.Toolkit;

public class BeepTask implements Runnable {//추가 스레드

	@Override // Runnable인터페이스에서 제공한 재정의용 메서드
	public void run() {
		// 비프음을 실행한 코드
		Toolkit tk = Toolkit.getDefaultToolkit(); //awt 패키지 활용
		for(int i=0 ; i<10 ; i++ ) {
			tk.beep(); // Toolkit 객체에 있는 비프음 메서드 실행
			
			try {
				Thread.sleep(1000);// 1초 동안 딜레이(밀리초) 
			} catch (InterruptedException e) {
				// 비프음 발생 예외처리
				System.out.println("비프음 오류발생");
				e.printStackTrace();
			} 
			
		}// 1초마다 1번씩 비프음 발생 시킴
		
		
		
		
	} 

}
