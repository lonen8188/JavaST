package ch07;

public class ComputerExam {

	public static void main(String[] args) {
		// Computer 객체를 이용하여 배열을 합계를 출력한다.
		Computer myCom = new Computer(); // 기본생성자로 객체 생성
		
		int[] values1 = new int[] {1,2,3}; // values1 변수에 배열 연결
		int result1 = myCom.sum1(values1);
		System.out.println("sum1... 을 이용한 합계출력 " + result1);
		
		int result2 = myCom.sum2(values1);
		System.out.println("sum2... 을 이용한 합계출력 " + result2);
	
		int result3 = myCom.sum2(1,2,3,4,5);
	}

}
