package ch04;

public class OperationExam {

	public static void main(String[] args) {
		// 단항연산자테스트
		// +는 부호를 유지한다. 
		// -는 부호를 변경한다.
		// ++은 증가연산자 , -- 감소연산자
		
		int x = 10 ;
		int y = 10 ;
		System.out.println("=======================");
		x++ ;
		System.out.println("x = " + x); //11
		++x ;		
		System.out.println("x = " + x); //12
		
		System.out.println("=======================");
		y-- ;
		System.out.println("y = " + y); //9
		--y ; 
		System.out.println("y = " + y); //8
		
		System.out.println("=======================");
		int z ;
		z = x++ ;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("=======================");
		z = ++x ;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		
		System.out.println("=======================");
		z = ++x + y++ ;  // ++x -> z = ++x + y -> y++
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		

		
	}

}
