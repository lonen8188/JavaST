package ch09.extended.promotion.exam;

public class ChildExam {

	public static void main(String[] args) {
		// 부모자식관계의 메서드 실행
		Child ch = new Child();
		ch.method1(); //부모메서드
		ch.method2(); //자식메서드(재정의용)
		ch.mehtod3(); //자식메서드
		
		Prarent pr = new Child();
		pr.method1(); //부모메서드
		pr.method2(); //부모메서드(오버라이딩 된 메서드)
		//pr.method3(); //자식메서드
		
		
		
		

	}

}
