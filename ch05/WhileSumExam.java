package ch05;

public class WhileSumExam {

	public static void main(String[] args) {
		// 1부터 100까지의 누적합을 while문으로 구현 해보세요!
		
		int sum = 0 ;  // 누적합 변수
		int i = 1 ;    // 1~100까지 증가 변수
		while (i <= 100) {  // 100까지 반복문
			sum += i ;  // sum = sum + i
			i++ ; 		// i = i + 1
		}

		System.out.println("1~100까지의 합 : " + sum);
	}

}
