package ch04;

public class StringConcatExam {

	public static void main(String[] args) {
		// 문자열 연결 연산자는 + 기호를 활용한다.
		// 왼쪽이 숫자로 시작하면 계산이 되고 문자 결합이 진행된다.
		String str1 = "JDK" + 17.0 ;
		System.out.println(str1);
		String str2 = str1 + " 특징" ; 
		System.out.println(str2);
		System.out.println("-----------------");
		
		String str3 = "JDK" + 3 + 3.0 ; 
		System.out.println(str3); 
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str4); 
	}

}
