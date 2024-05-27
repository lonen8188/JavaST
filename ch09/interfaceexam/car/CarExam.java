package ch09.interfaceexam.car;

public class CarExam {

	public static void main(String[] args) {
		// Car 클래스 실행용
		Car myCar = new Car();
		myCar.run();
		myCar.tires[2] = new HankookTire();
		myCar.tires[3]= new HankookTire();
		myCar.run();
	}

}
