package ch09.extended.abstractexam;

public class PhoneExam {

	public static void main(String[] args) {
		// 추상클래스와 실체클래스의 활용법
		//Phone ph = new Phone("김기원");
		//Phone 타입의 객체는 추상클래스로 인스턴스화 할수 없다.
		
		SmartPhone sp = new SmartPhone("김기원");
		
		sp.turnOn(); //조장이 가이드한 메서드
		sp.internetSearch(); //조원이 추가한 메서드
		sp.turnOff(); // 조장이 가이드한 메서드
		
	}

}
