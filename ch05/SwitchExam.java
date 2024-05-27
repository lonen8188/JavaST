package ch05;

public class SwitchExam {

	public static void main(String[] args) {
		// Switch라는 함수는 조건에 맞는 case를 실행한다.
		
		int num = (int)(Math.random()*10) + 1 ; //주사위 값을 랜덤 처리
		
		switch(num) {
		case 1 :
			System.out.println("1번이 나왔습니다.");
			//break;
		case 2 :
			System.out.println("2번이 나왔습니다.");
			//break;
		case 3 :
			System.out.println("3번이 나왔습니다.");
			//break;
		case 4 :
			System.out.println("4번이 나왔습니다.");
			//break;
		case 5 :
			System.out.println("5번이 나왔습니다.");
			//break;
		case 6 :
			System.out.println("6번이 나왔습니다.");
			//break;
		default : // 1~6번을 제외한 나머지 처리용
			System.out.println(num + "주사위 랜덤값 오류 : 개발자를 호출하세요!!!");
			//break;
		}

	}

}
