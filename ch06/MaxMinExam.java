package ch06;

import java.util.Scanner;

public class MaxMinExam {

	public static void main(String[] args) {
		// 배열에 있는 최고값과 최소값을 추출 해보자.
		Scanner in = new Scanner(System.in);
		System.out.print("학생수를 입력하세요~!!!! : " );		
		int count = in.nextInt();
		int[] scores = new int[count] ;
		
		for(int i=0 ; i < scores.length ; i++ ) {
			System.out.print(i+1 +"번 학생의 점수를 입력하세요 : ");
			scores[i] = in.nextInt() ; 
		} //입력용 for문 종료
			
		System.out.println("=========입력값 확인=========");
		for(int i=0 ; i < scores.length ; i++ ) {
			
			System.out.print(scores[i] + " ");
		} //출력용 for문 종료	
		System.out.println();
		System.out.println("===========================");
		// scores 변수에 7칸의 배열을 연결하고 초기값을 넣는다.
		
		int max = scores[0] ;
		int min = scores[0] ; // 최대값과 최소값을 기본값을 넣는다.
		
		for(int i = 1; i < scores.length ; i++ ) { // 배열 순서대로 비교 진행
			if(scores[i] > max) { // i번지 값이 max보다 크냐????
				max = scores[i] ; //큰값이면 max 변수에 넣어라
			}else if(scores[i] < min) { //i번지 값이 min보다 작냐????
				min = scores[i] ; //작은 값이면 min 변수에 넣어라
			} // if문 종료 (max, min 비교 및 삽입)
			
		} // for문 종료
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
