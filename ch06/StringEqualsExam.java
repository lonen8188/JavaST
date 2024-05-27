package ch06;

public class StringEqualsExam {

	public static void main(String[] args) {
		// 기본타입에 동등비교는 ==
		// 참조타입에 동등비교는 주소값을 비교한다.
		
		String str1 = "김기원" ; 
		String str2 = "김기원" ;
		String str3 = new String("김기원") ;
		
		if(str2 == str3) {
			System.out.println("str2과 str3는 참조가 같습니다.");
		}else {
			System.out.println("str2과 str3는 참조가 다름니다.");
		}
		
		if(str2.equals(str3)) {
			System.out.println("str2과 str3는 문자열이 같습니다.");
		}else {
			System.out.println("str2과 str3는 문자열이 다름니다.");
		}
		

	}

}
