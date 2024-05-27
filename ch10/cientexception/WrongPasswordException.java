package ch10.cientexception;

public class WrongPasswordException extends Exception{ //2
	// id 유뮤를 판단하는 예외처리용
	// login() 메서드에서 id를 확인하는데 존재하지 않는 id가 있을 때 처리
	// 사용자지정예외는 2가지의 생성자 필수
	
	public WrongPasswordException() {} //기본생성자
	public WrongPasswordException(String message) {
		super(message);
	}
}
