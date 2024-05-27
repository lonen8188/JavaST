package ch07;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행용 메인 메서드
		CarRunGas myCar = new CarRunGas(); //객체 생성
		
		myCar.setGas(10);  //가스 10충전
		
		boolean gasState = myCar.isLeftGas(); //가스 0이면 ???
		if(gasState) { //true면 가스있음
			System.out.println("출발합니다.");
			myCar.run(); //가스소모용 메서드
		}
		
		
		if(myCar.isLeftGas()) { // 가스 주입 
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요");
		}
	}

}
