package ch10.trycatch;

public class TryWithExam {

	public static void main(String[] args) {
		// 파일 읽기와 닫기를 실행하는 연습
		
		try (FileInputStExam fis = new FileInputStExam("text.txt")) { //리소스 블럭
			fis.read(); //메서드 호출
			throw new Exception(); // 강제적으로 예외발생
		} catch (Exception e) {
			System.out.println("예외처리 코드가 실행 되었습니다.");
		}

	}

}
