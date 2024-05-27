package ch09.extended.promotion.vehicle;

public class Taxi extends Vehicle {//Vehicle 자식 클래스

	@Override // 부모의 run()메서드 재정의
	public void run() {
		System.out.println("택시가 달립니다.");
	} 
	

}
