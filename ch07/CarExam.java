package ch07;

public class CarExam {

	public static void main(String[] args) {
		// Car 인스턴스객체를 사용하는 주 메서드
		// 전필우 자동차 주행 프로그램
		System.out.println("전필우 자동차 객체 생성");
		Car myCar = new Car("볼보", "xc90"); // 객체 생성하여 변수에 연결
		System.out.println("현재 자동차 상태 확인");
		System.out.println("제조회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상정보 : " + myCar.color);
		System.out.println("전필우씨 차량의 최고속도는 "+ myCar.maxSpeed);
		System.out.println("제발 안전운전 부탁드립니다.");
		
		
		Car secCar = new Car();
		
		
	}

}
