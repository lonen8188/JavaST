package ch09.extended;

public class ExtendedChExam extends ExtendedTest{ //extends를 붙이면 자식 -> 부모연결자
	//필드
	int 필드3;
	
	//생성자
	
	//메서드
	void 메서드3() {}
	
	public static void main(String[] args) {
		// 자식 객체가 되는 실행 영역
		
		ExtendedChExam ex = new ExtendedChExam(); //본인 객체 생성
		
		ex.부모필드1 = 10 ;
		ex.부모필드2 = "김기원" ; // 부모필드
		ex.필드3 = 30 ; // 자식 필드
		
		ex.메서드1();
		ex.메서드2(); //부모 메서드
		ex.메서드3(); //자식 메서드

	}

}
