package ch09.extended.override.airplane;

public class Airplane { //부모클래스(일반비행기)
	
	public void land() {
		System.out.println("부모-land().착륙합니다.");
	}

	public  void fly() {
		System.out.println("부모-fly().비행합니다.");
	}
	
	public void takeOff() {
		System.out.println("부모-takeOff().이륙합니다.");
	}
}
