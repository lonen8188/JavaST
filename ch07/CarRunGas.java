package ch07;

public class CarRunGas {	//자동차 주행용 (가스측정용)
	
	//필드
	int gas ; //가스량 측정용 필드
	//생성자
	CarRunGas(){
		//클래스명과 같은 메서드 (기본생성자)
	}	
	//메서드
	void setGas(int gas) {
		this.gas = gas ;
		System.out.println("현재 가스량(setGas메서드실행) : " + this.gas);
		//setGas(50) -> gas필드값이 50으로 삽입
	}// setGas 메서드 종료
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.(isLeftGas메서드실행)" + gas);
			return false; 
		}else {
			System.out.println("gas가 있습니다.(isLeftGas메서드실행)" + gas);
			return true ; 
		}
	}// gas량을 파악해서 주행 가능한지
	
	void run() {
		while(true) { //가스 소모중
			if(gas>0) { //가스가 0보다 크면
				System.out.println("달립니다.(run메서드실행) gas잔량 : (" + gas + ")");
				gas -= 1 ;
			}else { //가스가 0이면 
				System.out.println("멈춤니다.(run메서드실행) gas잔량 : (" + gas + ")");
				return;
			}
		}
		
		
		
	}	// run 메서드 종료 -> 가스 소모용
	
	
	
}
