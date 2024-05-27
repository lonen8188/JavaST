package ch09.extended.override.airplane;

public class SuperSonicAirplane extends Airplane{ //초음속 비행기 -> 자식
	//필드
	public static final int NORMAL = 1 ; //상수(변하지 않은 값)
	public static final int SUPERSONIC = 2 ;
	
	public int flyMode = NORMAL ; // 초기값이 1이 들어값
	
	//생성자
	
	//메서드
	@Override
	public void fly() { //일반비행의 초음속 모드로 재정의
		// flyMode가 1이면 일반 모드 비행 , 2면 초음속 모드 비행
		if(flyMode == SUPERSONIC) {
			System.out.println("자식-fly().초음속 비행 합니다.");
		}else {
			super.fly(); //부모에서 만든 fly() 메서드 실행	
		}
			
	}
	
	
	
	
	
	
	
	
	
}
