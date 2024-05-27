package ch09.interfaceexam;

public class AnonymousExam {

	public static void main(String[] args) {
		// 인터페이스를 구현클래스 사용하지않고 1회성으로 객체를 생성
		// {}; 필수
		// 중괄호 {} 안에는 인터페이스에 선언된 추상메서드를 실체 메서드로 작성
		// 추가적으로 필드와 메서드를 선언할 수 는 있지만 익명의 객체 안에서만 사용
		
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// 실행문
				System.out.println("전원을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("현재 볼륨 : " +  volume);
				
			}
			
			
		}; // 익명의 구현객체
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
	} //main()메서드 안에서 실행 가능

}
