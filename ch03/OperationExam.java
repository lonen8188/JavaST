package ch03;

public class OperationExam {

	public static void main(String[] args) {
		// 연산을 실행할때 기본은 int와 double이다.
		byte byteValue1 = 10 ;
		byte byteValue2 = 20 ;
		//byte byteValue3 = byteValue1 + byteValue2 ;
		int intValue1 = byteValue1 + byteValue2 ;
		System.out.println(intValue1);
		
		char charValue1 = '김' ; //65
		char charValue2 = 1 ; 
		//char charValue3 = charValue1 + charValue2 ;
		int intValue2 = charValue1 + charValue2 ; //자동타입변환 65+1
		System.out.println("유니코드 값 : " + intValue2);
		System.out.println("출력문자 값 : " + (char)intValue2);
		
		int intValue5 = 10 ;
		int intValue6 = (int) (intValue5 / 4.0) ; 
		System.out.println(intValue6);
		double doubleValue = intValue5 / 4.0 ; //실수형을 나눠야 정상값이 나옴
		System.out.println(doubleValue);
	}

	
	
	
	
	
}
