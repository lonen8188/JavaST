package ch01;

public class VariableExam {

	public static void main(String[] args) {
		// 변수형태 타입값을 넣어 보자.
		// int(정수), double(실수,소수점), char(문자)
		
		int mach ; // 정수타입의 mach변수 선언 (초기값 null)
		int distance ;  // 정수타입 변수 선언 초기값 없음
		mach = 340 ; // mach변수에 리터럴 값을 넣는다.
		distance = mach * 60 * 60 ; //음속 계산 공식
		System.out.println("소리가 1시간 동안 가는 거리 :" + distance + "m");

		
		double radius ; //소수점 처리 실수
		double area ; 
		radius = 10 ;
		area = radius * radius * 3.14 ; // 원의 넓이 계산
		System.out.println("반지름이 "+ radius + " 인 원의 넓이 " + area);
		
		char firstName ; //문자타입의 방 3개 생성
		char midName ;
		char lastName ;
		firstName = '김';
		midName = '기' ;
		lastName = '원' ;
		System.out.println(firstName);
		System.out.println(midName);
		System.out.println(lastName);
		
		int v1 = 15;
		int v2 = 0 ;
		if(v1>10) {
			//if에 true일 때 처리되는 블록
			v2 = v1 + 10;
		} //if문 종료
		
		int v3 = v1 + v2 + 5 ;
		System.out.println("v1의 값 : " + v1);
		System.out.println("v2의 값 : " + v2);
		System.out.println("v3의 값 : " + v3);
	} // main메서드 종료

} // class 종료


