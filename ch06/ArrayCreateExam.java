package ch06;

public class ArrayCreateExam {

	public static void main(String[] args) {
		// 배열은 Array라고 부르며 객체이다.
		// 배열을 이용해 총점과 평균을 처리하는 성적표를 만들어 보자.
		
		int[] scores =  new int[3] ; // int타입의 배열 생성과 값 입력
		scores[0] = 50 ;
		scores[1] = 70 ;
		scores[2] = 90 ;
		System.out.println("scores[0] :" + scores[0]);
		System.out.println("scores[1] :" + scores[1]);
		System.out.println("scores[2] :" + scores[2]);

		int sum = 0 ; // 총점 누적용
		for(int i=0 ; i<3 ; i++) { // 배열0~2까지 반복용
			sum += scores[i];  //번지에 해당하는 값을 sum에 누적
		} // for문 종료
		
		System.out.println("총점 : " + sum);
		double avg = (double) sum / 3 ;
		System.out.println("평균 : " + avg);
		
		
		
	}

}
