package ch10.cientexception;

public class Account {
	//필드
	private long balance ; //잔액
		
	//생성자
	public Account() {} //기본생성자
	
	//메서드 (입금, 출금....)
	public long getBalance() {
		return balance ;
	} //잔액 확인용
	
	public void deposit(int money) {
		balance += money; // balance = balance + money
	} //입금용
	
	public void withdraw(int money) throws BalanceException {
		if(balance < money) { // 잔액보다 출금액이 크면!!!!
			throw new BalanceException("잔고 부족 : " + (money-balance) + "부족합니다.");
			//예외 발생시킴(메시지 전달) -> 메시지 받는 사용자 지정 예외처리
		}else {
			//잔액이 충분하면
			balance -= money;
		}
	} //출금용 -> 예외발생가능성 있음
	
	
	
	
	
	
}
