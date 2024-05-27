package ch09.extended.promotion.vehicle;

public class Bus extends Vehicle {//Vehicle 자식 클래스

	@Override // 부모의 run()메서드 재정의
	public void run() {
		System.out.println("버스가 달립니다.");
	} 
	

}
