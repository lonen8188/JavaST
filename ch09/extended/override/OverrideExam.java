package ch09.extended.override;

public class OverrideExam {

	public static void main(String[] args) {
		// 부모 객체와 자식 객체의 메서드 사용
		int r = 10 ; 
		
		Calculator cal = new Calculator() ; // 부모객체 생성
		System.out.println("Calculator 객체를 사용한 원면적 값 : " + cal.areaCircle(r));
		System.out.println("------------------------------------");
		
		
		Computer com = new Computer(); //자식객체 생성
		System.out.println("Computer 객체를 사용한 원면적 값 : " + com.areaCircle(r));
		System.out.println("------------------------------------");
		
		
		
		

	}

}
