package ch07;

public class Car {
	//필드 -> 값을 보관하는 맴버변수
	//----------- 고유 데이터-----------
	String company = "포드" ; // 제작회사(현대,기아,gm,르노,kg)
	String model = "머스탱"; // 그랜져,아반테,모닝
	String color = "검정"; // 색상
	int maxSpeed = 320 ; // 최고 속도
	
	//------------상태----------------
	int speed ; // 현재속도
	int rpm ; // 현재 엔진 회전수
	boolean stop ; 
	
	//------------부품----------------
	Tire tire ; 
	Engine engine ; 
	Body body ;
	
	
	public Car(String company, String model, String color, int maxSpeed, int speed, int rpm, boolean stop) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		this.rpm = rpm;
		this.stop = stop;
	}
	//생성자 -> 객체 생성할 때 매개값을 관리는 메서드(new 연산자용)
	Car(){ //기본생성자로 생략 가능(이클립스 기능)
		speed = 0;
		rpm = 600;
		stop = false;
	} //생성자 종료
	Car(String company, String model){
		
	}
	
	
	
	
	
	
	
	//메서드 -> 동작, 처리를 담당하는 부분
	void addSpeed() {
		speed += 10;
		rpm += 100;
		stop = true;
	}
	
	void stop() {
		speed -= 10 ;
		rpm -= 100 ;
		
	}
	
	
} // Car클래스 종료

class Tire { //Car.java에 이너클래스로 public 선언시 오류
	//필드
	//생성자
	//메서드
}