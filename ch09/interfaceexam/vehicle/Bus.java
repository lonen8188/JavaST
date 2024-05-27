package ch09.interfaceexam.vehicle;

public class Bus implements Vehicle{ //구현객체

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		
	} //구현객체
	
	public void checkFare(int select) {
		if(select == 1) {
			System.out.println("버스카드로 결제 됩니다.");
		}else if(select ==2) {
			System.out.println("핸드폰으로 결제 됩니다.");
		}else {
			System.out.println("현금으로 결제 됩니다.");
		}
	}//bus 구현객체에서 추가된 메서드

}
