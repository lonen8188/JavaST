package ch09.extended.promotion.exam;

public class Child extends Prarent{
	//자식 클래스
	
	@Override
	void method2() {
		System.out.println("Child-메서드2-재정의()");
	}
	
	void mehtod3() {
		System.out.println("Child-메서드3");
	}
}
