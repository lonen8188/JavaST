package ch04;

public class StringEqualsExam {

	public static void main(String[] args) {
		// String은 참조 타입으로 문자열을 관리하는 객체
		// 타입에 앞글자가 대문자면 객체라고 생각하면 된다.
		
		String strval1 = "김기원" ;
		String strval2 = "김기원" ; 
		String strval3 = new String("김기원") ;
		
		System.out.println(strval1 == strval2);
		System.out.println(strval2 == strval3);
		System.out.println("------equals비교-----");
		System.out.println(strval1.equals(strval2));
		System.out.println(strval1.equals(strval3));

	}

}
