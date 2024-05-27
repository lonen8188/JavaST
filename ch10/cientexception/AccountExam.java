package ch10.cientexception;

public class AccountExam {

	public static void main(String[] args) {
		// Account 실행용 코드
		Account account = new Account(); //Account 객체 생성
		
		account.deposit(10000);// 10000원 입금용 코드
		
		System.out.println("현재 잔액은 : " + account.getBalance());
		
		try {
			account.withdraw(15000);
			System.out.println("현재 잔액은 : " + account.getBalance());
		} catch (BalanceException e) {
			String message = e.getMessage(); //예외에서 넘어온 문자열
			System.out.println(message);
			System.out.println("------------------");
					
			e.printStackTrace(); //로그 출력
		}

	}

}
