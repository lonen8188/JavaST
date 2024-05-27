package ch03;

public class PromotionExam {

	public static void main(String[] args) {
		// 자동타입변환 테스트
		// 작은 타입에서 큰 타입으로 자동 변환 되는 기법
		// 타입 변환시 값이 정상적으로 삽입 되어야 한다.
		
		byte byteValue = 10 ; // byte는 1byte처리용 -128 ~ 127
		int intValue = byteValue ; // 위에서 만든 byte 타입 값이 삽입
		System.out.println(intValue); //정상출력(자동타입변환)
		//byte byteValue1 = intValue ; 큰타입에서 작은 타입으로 안됨
		
		char charValue = '가' ; // 0 ~ 65535값을 처리(유니코드매핑)
		intValue = charValue ;  // 32bit -> int는 21억까지 처리
		System.out.println("가의 유니코드값 : "+ intValue);
		
		intValue = 500 ; // int타입에 500값을 넣음
		long longValue = intValue ; // int값을 long 타입에 삽입
		System.out.println("long으로 자동타입 변환 값 : " + longValue);
		
		double doubleValue = intValue ; // int값을 double 타입에 삽입
		System.out.println("double로 자동타입 변환 값 : " + doubleValue);
		

	}

}
