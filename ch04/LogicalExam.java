package ch04;

public class LogicalExam {

	public static void main(String[] args) {
		// | 는 or 연산을 진행하며 ~ 이거나, ~또는 이라는 뜻
		// & 는 값이 모두 true일 때 true값으로 나옴 (숫자 포함)
		// | 는 값이 하나라도 true이면 true로 나옴 (문자 찾음)

		int value = 6;
		if ((value % 2 == 0) | (value % 3 == 0)) { // 2의배수 or 3의 배수
			// true
			System.out.println("입력값 : " + value + "는 2의 배수 또는 3의 배수 입니다.");
		} else {
			System.out.println("입력값 : " + value + "는 2의 배수 또는 3의 배수가 아닙니다.");
		}

		if ((value % 2 == 0) && (value % 3 == 0)) { // 2의 배수 and 3의 배수
			System.out.println("입력값 : " + value + "는 2의 배수이고 3의 배수 입니다.");
		} else {
			System.out.println("입력값 : " + value + "는 2, 3의 배수가 아닙니다.");
		}

	}

}
