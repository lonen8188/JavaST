package ch10.cientexception;

public class NotExistIdException extends Exception{  //1
	// id 유뮤를 판단하는 예외처리용
	// login() 메서드에서 id를 확인하는데 존재하지 않는 id가 있을 때 처리
	// 사용자지정예외는 2가지의 생성자 필수
	
	public NotExistIdException() {} //기본생성자
	public NotExistIdException(String message) {
		super(message);
	}
}
