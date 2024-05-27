package ch05;

import java.util.Scanner;

public class ForSum2Exam {

	public static void main(String[] args) {
		// 최대값을 키보드로 입력 받아 합계를 출력
		Scanner in = new Scanner(System.in) ; 
		System.out.println("최대값을 입력하세요");
		int max = in.nextInt() ; // 키보드로 입력된 값을 max에 저장
		
		int sum = 0 ; // 누적합계 저장용
		
		for ( int i = 1 ; i <= max ; i++ ) {
			sum = sum + i ; 
			//System.out.println("i 값 : " + i + "\t sum 값 : " + sum);
		}
		System.out.println("1~" + (max) + "까지의 합은 : " + sum + "입니다.");
		

	}

}
