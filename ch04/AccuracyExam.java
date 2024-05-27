package ch04;

public class AccuracyExam {

	public static void main(String[] args) {
		// 사과 1개를 10개로 나누면 1조각이 0.1이 된다.
		// 이때 7조각을 먹으면?????
		
		int apple = 1 ; // 1개의 사과
		int totalPieces = apple * 10 ; // 1개의 사과를 10개로 조각으로 만듬
		int number = 7 ; // 7조각
		int temp = totalPieces - number ; // 10조각에서 7조각을 뺌
		
		System.out.println("사과 1개에서");
		System.out.println(number + "조각을 빼면");
		System.out.println(temp + "조각이 남습니다.");
		
		
		
		
		
		
		
		/*
		 * int apple = 1 ; // 사과1개 double pieceUnit = 0.1 ; // 사과를 10개로 쪼갠 조각 int number
		 * = 7 ; // 사과 7조각
		 * 
		 * double result = apple - ( number * pieceUnit ) ; // 7 * 0.1 = 0.7 // 1 - 0.7
		 * = 0.3 System.out.println("사과3쪽에 대한 값 : " + result);
		 */
		
		
		
		
		
	}

}
