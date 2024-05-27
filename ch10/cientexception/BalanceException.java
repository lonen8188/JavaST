package ch10.cientexception;

public class BalanceException extends Exception{
	//사용자 지정 예외처리 extends Exception
	//필수 2개 : 기본생성자 + 사용자지정생성자(메시지 전달)
	
	public BalanceException() {} //기본생성자
	
	public BalanceException(String message) {
		super(message);
		
	}//사용자 지정 생성자.
		
}
