package ch09.extended.promotion;
class A{} //부모클래스

class B extends A{} //자식클래스
class C extends A{} //자녀클래스

class D extends B{} //손자클래스
class E extends C{} //손녀클래스

public class PromotionExam { //부모자식관계의 자동타입변환
	public static void main(String[] args) {
		// 부모 자식간의 자동타입 변환 테스트
		A a1 = new B(); //다형성(자동타입변환)
		A a2 = new C();
		A a3 = new D();
		A a4 = new E();
		
		
		B b1 = new B();
		// B b2 = new C(); 같은 부모가 아님
		B b3 = new D();
		C c1 = new E();
		//C c2 = new D(); 같은 부모가 아님
		
		
		

		
	}

}
