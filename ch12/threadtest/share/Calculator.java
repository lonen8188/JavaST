package ch12.threadtest.share;

public class Calculator { //계산기용 객체
	//필드
	private int memory ; //계산기 공유용 필드

	//생성자 기본
	
	//메서드(게터, 세터)	
	public int getMemory() {
		return memory;
	} //게터 (값을 출력)

	public void setMemory(int memory) { //synchronized : 임계영역설정 (접근 금지)
		
		
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 2초간 딜레이
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
			// 메모리 값과 스레드 이름을 출력용
		} //동기화 블럭
		
	} //세터 (값을 입력)
	
	

}
