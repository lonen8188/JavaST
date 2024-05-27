package ch05;

public class IfDiceExam {

	public static void main(String[] args) {
		// 랜덤값을 이용하여 주사위 프로그램을 생성한다.

		int num = (int) (Math.random()*6)+1 ; 
		//랜덤값이 실수형이기 때문에 int형으로 강제 타입 변환
		System.out.println("주사위 값 :" + num);
		
		if(num == 1) {
			System.out.println("1번 값이 나왔습니다. 1차적으로 한잔하세요");
		}else if(num == 2) {
			System.out.println("2번 값이 나왔습니다. 2칸 옆자리와 한잔하세요");
		}else if(num == 3) {
			System.out.println("3번 값이 나왔습니다. 3잔을 마시면 됩니다.");
		}else if(num == 4) {
			System.out.println("4번 값이 나왔습니다. 빨대로 4번 흡입하세요");
		}else if(num == 5) {
			System.out.println("5번 값이 나왔습니다. 옆자리 한잔 드세요");
		}else if(num == 6) {
			System.out.println("6번 값이 나왔습니다. 춤을 추시면서 집에 가시면 됩니다.");
		}else {
			System.out.println("프로그램 오류 개발자에게 7잔을 맥이세요~~!!!");
		}
		
		
		
		
		
		
	}

}
