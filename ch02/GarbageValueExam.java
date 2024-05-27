package ch02;

public class GarbageValueExam {

	public static void main(String[] args) {
		// 프로그램 실행중 값이 넘칠 경우에 결과분석
		byte var1 = 125 ;
		int var2 = 125;
		for(int i=0 ; i<5 ; i++) {
			// i값이 0 ~ 5까지 1씩 증가용 코드 (5번 반복용)
			var1++ ; //var1값에 1씩 증가
			var2++ ; //var2값에 1씩 증가
			System.out.println(var1 + "         " + var2);
		}
	}

}
