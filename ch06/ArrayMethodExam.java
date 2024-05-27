package ch06;

public class ArrayMethodExam {

	public static void main(String[] args) {
		// 메서드를 활용하여 값을 처리 해본다.
		int[] scores = new int[] {70, 80, 90};
		int sum = add(scores) ;
		
		System.out.println("총합 : " + sum );
		double avg = avg(sum, scores) ;
		System.out.println("평균 : " + avg );
	} //메인 메서드 (주 실행)
	
	public static int add(int[] scores) { //합계용 메서드
		int sum = 0 ;
		System.out.println("현재 인원은 : " + scores.length);
		for (int i = 0 ; i < scores.length ; i++) {
			sum += scores[i];
		}
		
		return sum ; 
	} //라이브러리 메서드(합계용)종료
	
	public static double avg(int sum, int[] scores) {
		double avg = (double) sum / scores.length ;
		return avg ; 
	}

}
