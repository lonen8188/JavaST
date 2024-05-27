package ch09.extended.promotion.car;

public class HankookTire extends Tire{
	//필드 -> 부모필드 사용
	public int maxSpeed ; 
	public int size ;
	public int redius;
	public String name = "eco Tire" ;
	
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// 부모객체 생성자를 물려 받는다.
	}


	@Override // 부모 재정의용 메서드
	public boolean roll() {
		accRotation += 0.5 ; //누적 회전수 증가용(수명이 길다)
		if(accRotation < maxRotation) {
			//주행가능
			System.out.println(location + "한국타이어수명 :" 
			+ (maxRotation-accRotation) + " 마일리지가 남앗습니다.");
			return true ;
			
		}else {
			//주행 불가능
			System.out.println("***** 경고 " + location + " 한국타이어펑크(마일리지 소모)*****");
			return false ;
		}
	}
	
	public int tpms() {
		int tpm = 45;
		// 공기압 측정용 시스템 적용
		return tpm;
	}
	
	

}
