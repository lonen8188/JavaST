package ch06;

public class MainStringArgExam {

	public static void main(String[] args) {
		// String[] args 는 cmd에서 MainStringArgExam.java를 실행할 때 값을 받을 수 있는
		// 문자열을 배열타입으로 값을 받아 저장한다. args[0] args[1].......
		// cmd에서 javac로 컴파일 후에 MainStringArgExam 10 20 입력하면 
		// args[0] = 10,  args[1] = 20이 들어가 처리한다.
		// 이클립스는 Run Configurations에 Arguments에 값을 넣으면 위와 같다.
		
		if(args.length != 2) { //args값이 2개가 아니면 -> 사용법을 출력
			System.out.println("프로그램사용법");
			System.out.println("java MainStringArgExam num1 num2");
			System.exit(0); // 프로그램 강제 종료
		}
		
		String strNum1 = args[0] ;
		String strNum2 = args[1] ;
		
		int num1 = Integer.parseInt(strNum1); // args[0]문자를 숫자로 변환
		int num2 = Integer.parseInt(strNum2); // args[1]문자를 숫자로 변환
		
		int result = num1 + num2 ;
		System.out.println(num1 + " + " + num2 + " = " + result);
				
		

	}

}
