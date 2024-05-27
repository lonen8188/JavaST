package ch05;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// if는 판단을 해서 true와 false를 처리하는 함수이다.
		Scanner in = new Scanner(System.in); //키보드로 입력을 받는 객체 생성
		
		System.out.print("귀하의 점수를 입력하세요!!! : ");
		int score = in.nextInt(); //키보드로 입력한 정수값을 score변수에 넣는다.
		
		if(score>100 || score <0) {
			System.out.println("입력값이 잘못 되었습니다.(100~0점)");
			System.out.println("다시 실행하세요~!!!");
		}else {
		if(score>=90) { // score변수에 값이 90이상인지 판다.
			// true일때 처리되는 실행문
			System.out.println("점수가 90점 이상입니다. : " + score);
			System.out.println("귀하의 등급은 A등급 입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다. : " + score);
			System.out.println("귀하의 등급은 B등급 입니다.");
		} //90미만 IF 종료
		}
	}//main() 메서드 종료

} //클래스 종료
