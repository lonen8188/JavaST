package ch06;

public class ArraySortExam {

	public static void main(String[] args) {
		// 배열에 있는 값을 오름차순 내림차순 정렬을 진행해보자.
		// 버블 정렬은 이웃간에 비교를 통해 자리 바꿈으로 정렬 한다.
		// 마지막 칸에 있는 숫자는 정해진 값이라 더이상 비교할 필요가 없다.
		
		int[] scores = new int[] {79, 88, 91, 33, 100, 55, 95} ;
		
		//입력값 확인
		System.out.println("======입력값 확인용======");
		for(int i = 0; i < scores.length ; i++) {
			System.out.print(scores[i] + " ");
		} //입력값 확인용 for 종료
		System.out.println();
		System.out.println("======================");
		
		//정렬시 세부 진행도
		for(int j = 0 ; j < scores.length-1 ; j++) { //0~6까지 반복(싸이클반복)
			for(int k = 0 ; k < scores.length-1-j ; k++) {//앞뒤 비교용
				// j = 0 -> 7-1-0 (6)
				// j = 1 -> 7-1-1 (5)
				// j = 2 -> 7-1-2 (4)
				// j = 6 -> 7-1-6 (0)
				if(scores[k] > scores[k+1]) { //짝꿍과 비교에서 크면
					int tmp = scores[k];
					scores[k] = scores[k+1];
					scores[k+1] = tmp; // 앞뒤 자리변경 완료
				} // if문 종료
			//	System.out.println(scores[k] + " - " + scores[k+1]);
			} //for문 종료
			
		}//for문 종료
			
		//마지막 출력 값 확인
		System.out.println("=======오름차순 마지막 결과 값 확인=====");
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.print(scores[i] + " " );
		}
		System.out.println();
		
		//정렬시 세부 진행도
				for(int j = 0 ; j < scores.length-1 ; j++) { //0~6까지 반복(싸이클반복)
					for(int k = 0 ; k < scores.length-1-j ; k++) {//앞뒤 비교용
						// j = 0 -> 7-1-0 (6)
						// j = 1 -> 7-1-1 (5)
						// j = 2 -> 7-1-2 (4)
						// j = 6 -> 7-1-6 (0)
						if(scores[k] < scores[k+1]) { //짝꿍과 비교에서 크면
							int tmp = scores[k];
							scores[k] = scores[k+1];
							scores[k+1] = tmp; // 앞뒤 자리변경 완료
						} // if문 종료
					//	System.out.println(scores[k] + " - " + scores[k+1]);
					} //for문 종료
					
				}//for문 종료
		
				//마지막 출력 값 확인
				System.out.println("=======내림차순 마지막 결과 값 확인=====");
				for(int i = 0 ; i < scores.length ; i++) {
					System.out.print(scores[i] + " " );
				}

	}

}
