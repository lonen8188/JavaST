package ch02;

public class CharExam {

	public static void main(String[] args) {
		// char타입의 유니코드 매핑테스트
		// char타입은 음수없다, 0~65535범위에 매핑테이블 사용
		
		char c1 = '1' ;
		char c2 = '2' ;
		char c3 = '3' ;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1 + c2 + c3);
		
		
		char han1 = '가' ;
		char han2 = 44032 ;
		char han3 = '\uac00' ;

		System.out.println(han1);
		System.out.println(han2);
		System.out.println(han3);
		
		int uniCode1 = '김';
		int uniCode2 = '기';
		int uniCode3 = '원';
		
		System.out.println(uniCode1);
		System.out.println(uniCode2);
		System.out.println(uniCode3);
		
	}

}
