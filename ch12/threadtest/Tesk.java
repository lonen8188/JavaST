package ch12.threadtest;

public class Tesk implements Runnable {//방법1
	//방법1 : Runnable 인터페이스를 사용하는 구현 클래스를 생성하는
	//방법2 : 다형성 -> Thread th = new Thread(Runnable target);

	@Override //Runnable인터페이스에서 강제 주입 받은 메서드
	public void run() {
		// 스레드 실행용 코드를 작성한다.
		
	} 

}
