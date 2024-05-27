package ch05;

import java.util.Scanner;

public class UpAndDownExam {

	public static void main(String[] args) {
		// 업엔다운게임은 컴퓨터가 랜덤값을 기억하고 우리가 맞추는 게임
		// 컴퓨터 만든 숫자를 우리가 맞춤
		// 키보드로 입력된 숫자가 컴퓨터 숫자보다 작으면 down, 크면 up으로 만듬
		
		int input = 0, answer = 0 ; //사람이 입력하는 숫자는 input, 컴퓨터 만든 숫자 answer
		
		answer = (int)(Math.random()*31)+1; //1~31사이에 랜덤값
		Scanner in = new Scanner(System.in);
		
		do { //up-down 판단하기
			System.out.println("1과 31사이의 정수값을 입력하세요");
			input = in.nextInt(); //정수값을 입력 받는다.
			
			if(input > answer) { // 입력값이 크면
				System.out.println("down");
			}else if(input < answer) { //입력값이 작으면
				System.out.println("up");
			}
			
		}while (input != answer); // answer와 사람이 입력한 input이 일치하면 종료 
		 System.out.println("정답입니다.");
		 System.out.println("컴퓨터 랜덤값 : " + answer);
		 System.out.println("사용자 입력값 : " + input );
		
	}

}
