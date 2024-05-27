package ch09.nestedclass;

public class A { //new 연산자를 사용해야 하는 인스턴스(객체)
	//필드
	class B {//new 연산자를 사용해야 하는 인스턴스(객체)
		//필드
		int field1;
		static int field2 ;  //17버전 이후부터 가능
		//생성자
		B(){}
		//메서드
		void method1() {
			System.out.println("B클래스 인스턴스 메서드1 실행");
		}
		static void method2() {
			System.out.println("B클래스 정적 메서드2 실행");
		} //17버전 이후부터 가능
	}//내부 클래스(inner)
	
	static class C{ //new 연산자 없이 사용하는 클래스
		C() {} //생성자
		int field1 ;
		static int field2;
		void method1() {
			System.out.println("C정적클래스 인스턴스 메서드1 실행");
		};
		static void method2() {
			System.out.println("C정적클래스 정적 메서드2 실행");
		} ;
	}//내부 정적 클래스(inner)
	
	
	
	
	//생성자
	
	
	//메서드 A클래스용
	void method() {//외부 A클래스의 메서드
		class D {
			D() {} //생성자
			int field1 ; 
			static int field2 ;
			
			void method1() {
				System.out.println("A클래스 안쪽 메서드의 D 클래스의 메서드1 인스턴스 실행");
			}
			static void method2() {
				System.out.println("A클래스 안쪽 메서드의 D 클래스의 메서드2 정적 실행");
			}
			
		} // A클래스 안쪽 메서드 안쪽 D 클래스		
		//메서드 안쪽에 있는 클래스기 때문에 내부에서만 호출 가능
		D d = new D(); 
		d.field1 = 50;
		d.method1(); //인스턴스 메서드
		d.method2(); //정적 메서드(객체활용)
		D.method2(); //정적 메서드(클래스 활용)
		
		
		
	}
	
	
	
	

	
	
	
}
