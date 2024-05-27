package ch05;

import java.util.Scanner;

public class IfSsnExam {

	public static void main(String[] args) {
		// 주민등록번호를 활용하는 예제

		Scanner in = new Scanner(System.in); //스케너 객체를 in으로 연결
		
		System.out.println("주민번호를 입력하세요(-생략, 13글자)");
		String ssn = in.nextLine(); // 문자열을 입력받아 ssn 변수에 넣는다.
		
		System.out.println("입력받은 주민번호 : " + ssn);
		
		char ssn7 = ssn.charAt(6); // 주민번호에 7번째 글자를 추출하여 ssn7에 삽입
		System.out.println("주민번호 7번째 글자 : " + ssn7);
		 
		//주민번호 7번째 글자를 추출하여 남여 구분
		if(ssn7 == '1' | ssn7 == '3' | ssn7 == '5' | ssn7 == '7') {
			System.out.println("문자로 체크한 결과 남자입니다.");
		}else {
			System.out.println("문자로 체크한 결과 여자입니다.");
		}
		
		//char로 받은 값을 숫자로 변환 하여 남여 판단
		int num7 = Character.getNumericValue(ssn7); //char -> int
		if(num7 % 2 == 0 ) { // num7을 2로 나누었을 때 나머지가 0 -> 짝수
			System.out.println("홀짝으로 계산된 결과 여자(짝수) 입니다.");
		}else if(num7 % 2 == 1 ) { // num7을 2로 나누었을 때 나머지가 1 -> 홀수
			System.out.println("홀짝으로 계산된 결과 남자(홀수) 입니다.");
		}else {
			System.out.println("외계인으로 판정 되었습니다. 자기별로 돌아가세요!!!!");
		}
		
		String yearString = ssn.substring(0, 2); //ssn.substring(시작인덱스, 마지막인덱스-1)
		System.out.println("ssn문자열을 앞2개 추출 : " + yearString );
		int year = Integer.parseInt(yearString);//문자열에서 정수로 추출
		
		//Integer.parseInt(문자열을 숫자로 변경)
		
				
		//나이 계산용 코드 (1900년생과 2000년생을 나누어 체크)
		if( num7 == 1 | num7 == 2 | num7 == 5 | num7 == 6 ) { //1900년생
			System.out.println("현재 나이는 " + (2023 - (1900 + year))+ "세 입니다.");
		}else if( num7 == 3 | num7 == 4 | num7 == 7 | num7 == 8 ) { //1900년생
			System.out.println("현재 나이는 " + (2023 - (2000 + year))+ "세 입니다.");
		}
		
		
	}

}
