package ch09.extended.promotion.car;

public class Tire {//부모타이어 -> 자식에게 필드,메서드를 전달
	//필드
	public int maxRotation ; //최대 회전수(마일리지, 타이어 수명)
	public int accRotation ; //주행거리(1씩 증가)
	public String location ; //타이어 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation ;
	}
	
	//메서드
	public boolean roll() { //주행중 마일리지 감소용
		++accRotation ; //누적 회전수 증가용(기본값)
		if(accRotation < maxRotation) {
			//주행가능
			System.out.println(location + "부모타이어수명 :" 
			+ (maxRotation-accRotation) + " 마일리지가 남앗습니다.");
			return true ;
			
		}else {
			//주행 불가능
			System.out.println("***** 경고 " + location + " 부모타이어펑크(마일리지 소모)*****");
			return false ;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
