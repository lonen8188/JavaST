package ch12.threadtest.share;

public class User2 extends Thread{ //extends Thread 스레드용(상속)
	//필드값 공유 사용시 문제점
	private Calculator calculator;
	
	//세터
	public void setCalculator(Calculator cal) {
		this.setName("User2스레드");
		this.calculator = cal ;
	}
	
	public void run() {
		calculator.setMemory(50); // 계산기 객체필드에 100을 넣음
	}
}
