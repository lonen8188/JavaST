package ch03;

public class CastingExam {

	public static void main(String[] args) {
		// 강제타입변환 -> 캐스팅 (큰타입을 작은타입으로 강제 삽입)
		// 값이 손실되어도 강제로 적용하는 기법
		// 사용법 : byte 변수명 = (byte) int변수명 ;

		int intValue = 123456789 ;
		byte byteValue = (byte) intValue ;
		
		System.out.println(intValue);
		System.out.println(byteValue);
		
		
		intValue = 44032 ; // 정수형으로 값 삽입
		char charValue = (char) intValue ; //강제타입변환
		System.out.println("int 44032를 char로 강제타입변환 :" + charValue);
		
		double doubleValue = 3.14159265358979 ;
		intValue = (int) doubleValue; 
		System.out.println(intValue);
		
	}

}
