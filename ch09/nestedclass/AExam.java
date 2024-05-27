package ch09.nestedclass;

public class AExam {

	public static void main(String[] args) {
		// 이너 클래스 활용
		A.B.field2 = 50; //이너 정적 필드 사용가능
		A.B.method2();  //이너 정적 메서드 사용가능 17버전 이후
		
		A a = new A(); //외부클래스 객체 생성
		A.B b = new A().new B();  //내부 클래스 객체 생성
		
		b.field1 = 50 ; //이너 필드 값 저장
		b.method1();	//이너 메서드 사용
		
		
		A.C c = new A.C();
		c.field1 = 50 ;
		c.method1();
		c.method2();  //객체용으로 사용
		
		A.C.method2(); //정적용 사용
		
		
		a.method(); //A클래스에 있는 메서드 호출
		//메서드 안쪽에 클래스를 즉시 사용 가능
		
		

	}

}
