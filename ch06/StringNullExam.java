package ch06;

public class StringNullExam {

	public static void main(String[] args) {
		// 기본 타입은 == 연산시 값이 같은지를 물어봄(int, double, long.....)
		// 참조 타입은 == 연산시 주소가 같은지를 물어봄(String, 나머지 모두)
		
		String name = "김기원" ;
		String hobby = "볼링" ;
		
		System.out.println("name의 총 문자수 : " + name.length()); //length() 길이
		System.out.println("hobby의 총 문자수 : " + hobby.length());
		
	}

}
