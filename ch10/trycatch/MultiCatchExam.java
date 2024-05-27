package ch10.trycatch;

public class MultiCatchExam {

	public static void main(String[] args) {
		// catch블럭은 여러개 가능
		
		try {
			String data1 = null;
			String data2 = null;
			data1 = args[0];
			data2 = args[1]; // 예외는 arguments값이 2개가 아닐때 
			int value1 = Integer.parseInt(data1);	// 문자를 숫자로 변환 
			int value2 = Integer.parseInt(data2);	// 예외발생가능
			int result = value1 + value2 ; // 예외발생가능(int 범위초과)
			System.out.println(data1 + " + " + data2 + " = " + result );
			
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) { 
			// arguments 값이 2개가 아닐 때 예외 |(이거나) 문자가 숫자로 변환 안될 때 예외처리
			System.out.println("실행 매개 값이 부족하거나 정수형이 아닙니다.");
			System.out.println("arguments에 2개의 숫자(정수)를 넣어 주세요");
		} catch (Exception e) {
			// 예외처리의 최상위 클래스로 모든 예외를 담당한다.
			System.out.println("프로그램 개발자를 호출해 주세요");
			e.printStackTrace();
		}finally {
			System.out.println("다시실행은 Ctrl + f11을 눌러 주세요");
		}
		
		
		
	}

}
