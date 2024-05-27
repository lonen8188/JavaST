package ch09.interfaceexam.car;

public interface Tire { //인터페이스는 new()로 불가능-> 구현클래스 필수
	//상수
	
	//메서드(추상, 디폴트, 정적)
	public void roll(); //abstract기본값, {}없이 구현객체에게 강제 주입
	//Tire 인터페이스를 구현하는 객체는 무조건 roll()메서드를 사용할 것!!!!
	

}
