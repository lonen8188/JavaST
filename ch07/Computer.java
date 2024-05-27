package ch07;

public class Computer {
	// 배열 테스트용 코드 객체
	
	int sum1(int[] values) {
		int sum = 0 ; 
		for(int i=0 ; i<values.length ; i++) {
			sum += values[i];
		} // 배열 안에 모든 값을 순서대로 더한후 sum에 누적
		
		return sum ;	//결과값을 반환
	} //sum1()메서드 종료
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0 ; i<values.length ; i++) {
			sum += values[i];
		} //배열 안에 모든 값을 순서대로 더한후 sum에 누적
		
		
		return sum;
	}
	
	
	
	
	
	
	
}
