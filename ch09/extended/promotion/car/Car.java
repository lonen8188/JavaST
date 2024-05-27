package ch09.extended.promotion.car;

public class Car { //자동차 객체로 타이어 부품을 장착한다.
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽", 10);
	Tire frontRightTire = new Tire("앞오른쪽", 12);
	Tire backLeftTire = new Tire("뒤왼쪽", 15);
	Tire backRightTire = new Tire("뒤오른쪽", 17);
	//자동차 객체에 타이어부품 4개 장착
		
	//생성자(기본)
	
	//메서드(주행을 하여 마일리지 소모)
	int run() { // 자동차 바퀴의 인덱스 리턴
		if(frontLeftTire.roll()==false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		
		return 0;
	}

	private void stop() {
		System.out.println("stop()메서드 실행- 자동차가 멈춥니다.");//펑크
		
	}

}
