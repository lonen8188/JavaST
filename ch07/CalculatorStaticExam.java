package ch07;

public class CalculatorStaticExam {

	public static void main(String[] args) {
		// 정적 메서드를 호출하는 주 메서드
		CalculatorStatic myCalc = new CalculatorStatic(); //인스턴스 용
		double result1 = 10 * 10 * myCalc.pi;
		System.out.println("인스턴스로 만든 결과물 : " + result1);
		int result4 = myCalc.plus(20, 30);
		System.out.println("인스턴스 plus메서드 실행 : " + result4);
		
		
		// 인스턴스 없이 바로 실행
		double result2 = 10 * 10 * CalculatorStatic.pi;
		System.out.println("정적필드로 만든 결과물 : " + result2);
		CalculatorStatic.pi = 4 ;
		double result3 = 10 * 10 * CalculatorStatic.pi;
		System.out.println("정적필드로 만든 결과물 : " + result3);
		int result5 = CalculatorStatic.plus(40, 50);
		System.out.println("정적메서드로 만든 결과물 : " + result5);
	}

}
