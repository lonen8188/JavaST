package ch08.exam01.package2;

import ch08.exam01.package1.A;
import ch08.exam01.package1.B;

public class C {

	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 2; //디폴트
		//a.field3 = 3; //private
 		
		a.method1();
		//a.method2(); //디폴트
		//a.method3(); //private
		
		
		
		
		
	}
}
