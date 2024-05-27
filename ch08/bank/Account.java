package ch08.bank;

public class Account { //라이브러리 객체(인스턴스) api
	//ano(계좌번호), owner(계좌주), balance(잔고)를 관리하는 객체
	//필드
	private String ano;
	private String owner;
	private int balance ;
	
	//생성자(기본생성자 없음 new Account(); 안됨 )
	public Account(String ano, String owner, int balance) {
		//super(); 상속에 관련된 메서드
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	} // main 메서드에서 new Account(계좌번호,계좌주,금액)

	
	//메서드(getter, setter -> 현재 필드가 private임)
	public String getAno() { return ano;	}
	public String getOwner() { return owner;	}
	public int getBalance() {	return balance;	}
	
	public void setAno(String ano) {this.ano = ano;}
	public void setOwner(String owner) {this.owner = owner;}
	public void setBalance(int balance) {this.balance = balance;}


	@Override
	public String toString() {
		return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
	// 각각의 계정에 대한 계좌번호, 계좌주, 계좌금액을 가지고 있는 객체
	// vo, dto라고 부름
	
	
}
