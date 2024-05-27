package ch12.threadtest.beep;

import java.awt.Toolkit;

public class BeepMainExam {

	public static void main(String[] args) {
		// 스레드 없는 소리와 자막 연출하기
		// 스레드 객체 생성
		Runnable bt = new BeepTask(); // run이 있는 구현객체
		Thread th1 = new Thread(bt); // 스레드객체에 비프음 작업을 연결
		th1.start(); // 스레드 시작
				
		//자막 출력용 코드
		for(int i=0; i<10 ; i++) {
			System.out.println("띠리링~");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("자막 오류발생");
				e.printStackTrace();
			}
		} // 1초마다 자막 출력
		
		
		
		
		
		
		
		
		

	}

}
