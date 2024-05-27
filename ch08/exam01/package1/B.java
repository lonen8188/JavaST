package ch08.exam01.package1;

public class B {  // public 접근제한
	// public 접근 제한은 아무나 모두 사용 가능.
	public B() { //B생성자 안에서 테스트
		A a = new A();
		a.field1 = 1; //public
		a.field2 = 2; //default
		//a.field3 = 3; //private
		
		a.method1();
		a.method2();
		//a.method3(); //private
	}
}
