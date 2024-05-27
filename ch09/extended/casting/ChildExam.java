package ch09.extended.casting;

public class ChildExam {

	public static void main(String[] args) {
		// 강제타입 변환 실습
		Parent pr = new Child(); // 다형성(자식을 만들면서 부모타입활용)
		pr.field1 = "김기원";
		pr.field2 = 50 ;
		//pr.field3 = "자식필드값";
		
		pr.method1(); // 부모 메서드
		pr.method2(); // 자식오버라이드 메서드(재정의)
		
		
		Child ch = (Child) pr ;
		ch.field3 = "강제타입변환 성공" ;
		ch.method3(); //자식에서 만든 메서드
				
		
		
		

	}

}
