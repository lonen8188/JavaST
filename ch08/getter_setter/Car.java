package ch08.getter_setter;

public class Car { // 인스턴스용 객체
	//필드 (앞으로 무조건 private 선언)
	private int speed; 
	
	//생성자 (기본생성자-자동생성)
	
	
	//메서드 (값을 입력받는 setter, 값을 출력하는 getter)
	void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
		}else {
			this.speed = speed;
		}
		
		
		
	} //speed에 값을 입력하는 메서드
	
	double getSpeed() {
		double km = this.speed * 1.6;
		return km  ;
	} //speed에 값을 리턴하는 메서드
	
	
	
	
	
	
	
	
}
