package ch10.trycatch;

public class TryCatchExam {

	public static void main(String[] args) {
		// 예외처리 실습
		// try{} -> 예외발생가능성 있는 코드블럭
		// catch{} -> 예외발생시 처리 블럭
		// finally{} -> 예외 상관 없이 항성 처리되는 블럭

		// 클래스 명으로 클래스 있는지 찾는 메서드
		
		try { // 예외발생가능성이 있는 코드 블럭
			Class clazz1 = Class.forName("java.lang.String2");
			System.out.println("해당하는 클래스가 존재합니다.");
			
		} catch (ClassNotFoundException e) {
			// 예외 발생시 처리용 블럭
			System.out.println("해당하는 클래스가 존재하지 않습니다.");
			e.printStackTrace();
		} finally { //항상 실행 되는 코드
			System.out.println("프로그램이 정상 종료 되었습니다.");
			
		}
		
		
		
		
		
		
		
		
		
	}

}
