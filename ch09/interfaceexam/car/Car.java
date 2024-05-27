package ch09.interfaceexam.car;

public class Car { //타이어를 부품화 하는 클래스
	Tire[] tires = {
			new HankookTire(), // Tire[0]
			new HankookTire(), // Tire[1]
			new HankookTire(), // Tire[2]
			new HankookTire()  // Tire[3]
			
	};
	
	
	Tire SpTire = new Tire() {
		@Override
		public void roll() {
			System.out.println("타이어고장시 교체용 스페어 타이어 입니다.");
		}
	}; //익명
			
	void run() {
		for(Tire tire : tires) {
			tire.roll(); // 반복 실행
		}
		
	}//Car.run()메서드

}
