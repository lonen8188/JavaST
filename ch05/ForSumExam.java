package ch05;

public class ForSumExam {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 구해 본다.
		// 1+2+3+4+5+ ...... 100 = 5050
		int sum = 0 ; //총합을 저장하는 변수

		for( int i = 1 ; i<=100 ; i++ ) { // 1~100까지 증가
			sum = sum + i ; 
			// 1 = 0 + 1
			// 3 = 1 + 2
			// 6 = 3 + 3
			// 10 = 6 + 4
			// 15 = 10 + 5
			// ???? = ???? + 100
			//System.out.println("i값 : " + i + "\t sum 값 : " + sum );
			
		} //for문 종료
		System.out.println("1~100까지의 합 : " + sum);
	} // main()메서드 종료

} // class 종료
