package ch14.funtionalInterface;

@FunctionalInterface //함수적인터페이스로 선언(2개의 메서드인지 판단)
public interface MyFuntion { //interface : 직접 객체화가 안됨
	// 구현 객체를 클래스로 만들어 사용한다.
	// 함수로 만들기 위해서는 메서드 1개만 가지고 있어야 한다.
	public int method1(int x, int y); //인터페이스에 선언된 메서드는 추상메서드임 {}없다.
	//public void otherMethod();

}
