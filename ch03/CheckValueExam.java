package ch03;

public class CheckValueExam {

	public static void main(String[] args) {
		// java가 가지고 있는 타입의 최소,최고값을 활용하여 변환값을 체크한다.
		// MAX_VALUE에는 최고값, MIN_VALUE에는 최소값을 가지고 있다.(상수)
		
		int i = -129 ; // int타입 i변수에 128 값을 넣는다.
				
		if((i>=Byte.MIN_VALUE && i<=Byte.MAX_VALUE)) {//i값이 byte최고값보다 작고, i값이 byte최저값보다 크다
			//참일 때 값
			byte b = (byte) i ; // int타입을 byte 타입으로 강제타입 변환
			System.out.println(b);
			
		} else {
			//거짓을 때 값
			System.out.println("변환할 수 없는 값입니다.");
			System.out.println("강제 변환시 값이 변형됩니다.");
		}
		
		
		
		
		

	}

}
