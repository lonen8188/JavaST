package ch08.getter_setter;

public class CarExam {

	public static void main(String[] args) {
		// car 인스턴스 필드 값 변경용 연습
		Car car = new Car();
		//car.speed = - 30; 필드에 직접 접근 안됨.
		//메서드를 만들어 값을 수정
		car.setSpeed(30);
		System.out.println("Car객체의 speed값(마일) : " + car.getSpeed());
	}

}
