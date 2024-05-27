package ch14.funtionalInterface;

public class MyfuntionExam {

	public static void main(String[] args) {
		// 람다식 기본 예제 실습(방금 만든 인터페이스를 활용)
		
		MyFuntion fi ; // fi변수는 MyFuntion타입 임을 명시
		
		fi = (x, y) -> { //매개변수가 없는 호출
			int result= x +y ;			
			return result;
		}; //람다식 기본 문법(익명의 구현 객체)
		int print = fi.method1(2, 4); //실행문2개
		System.out.println(print);
		
		
		fi = (x, y) -> { return x + y; };
		int print1 = fi.method1(4, 5); //실행문1개
		System.out.println(print1);

		fi = (x, y) -> x + y ; 
		int print2 = fi.method1(8, 8); //실행문이 1개라 {};, return 생략
		System.out.println(print2);
		
		fi = (x, y) -> sum(x, y); //sum 메서드를 활용(하단에 만듬)
		System.out.println(fi.method1(6, 7));
		
	}

	private static int sum(int x, int y) {
		 
		return (x + y);
	}

}
