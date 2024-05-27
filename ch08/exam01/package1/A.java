package ch08.exam01.package1;

public class A { //default 접근제한
	//필드
	public int field1 ; //공용
	int field2 ;		//디폴트
	private int field3 ;//개인 
	
	//생성자
	public A() {
		field1 = 1 ;
		field2 = 2 ;
		field3 = 3 ;  //위에 있는 필드값 삽입
		
		method1();
		method2();
		method3(); //아래 있는 메서드 호출
	}
	
	//메서드
	public void method1() {}	//공용
	void method2() {}			//디폴트
	private void method3() {}	//개인
	
	
	
	

	
	
	
}
