package ch09.extended.override.airplane;

public class SuperSonicExam {

	public static void main(String[] args) {
		// 자식객체를 생성하여 테스트
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeOff(); //이륙합니다.
		sa.fly(); //비행합니다.
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		//flyMode 값이 2로 변경된다.
		sa.fly(); //초음속 비행합니다.
		sa.flyMode = SuperSonicAirplane.NORMAL;
		//flyMode 값이 1로 변경된다.
		sa.fly();
		sa.land(); //착륙합니다.

	}

}
