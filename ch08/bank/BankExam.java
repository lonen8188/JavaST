package ch08.bank;

import java.util.Scanner;

public class BankExam {
	//필드
	private static Account[] accountArr = new Account[100];
	// Account 객체를 배열로 만들면 객체 안에 자료형이 다양해지고 활용 가능
	private static Scanner in = new Scanner(System.in);//맴버변수(필드)
	
	//정적블럭
	
	//메서드
	public static void main(String[] args) {
		// Account 객체를 사용하여 배열 100개를 만듬
		// 배열에는 계좌를 구현할 수 있도록 셋팅
		// 키보드로 입력 받는 메뉴로 구현(Scanner)
		boolean run = true; //while문 용
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("-------------------------------------------");
			System.out.print(">>>"); //입력용
			int selectNo = in.nextInt(); // 정수입력
			
			switch (selectNo) {
			case 1: //계좌생성용 코드
				createAccount();
				break ;
			case 2: //계좌목록
				accountList();
				break ;
			case 3: // 입금-예금
				deposit();
				break ;
			case 4: // 출금
				
				break ;
			case 5: // 종료
				
				break ;
			default: //1~5 이외의 코드
				System.out.println("1~5값만 입력하세요");
			}
			
			
			
			
			
			
			
			
		}// while문 종료(메뉴용)	
		

	}

	private static void deposit() {
		// 예금을 담당하는 메서드
		// 계좌번호를 찾아 키보드로 입력된 금액을 누적한다.
		System.out.println("==================");
		System.out.println("======예금입금======");
		System.out.println("==================");
		System.out.print("계좌번호 : ");
		String ano = in.next();
		System.out.print("예금액 : ");
		int money = in.nextInt() ;
		Account account = findAccount(ano);
		// 키보드로 입력받은 ano를 전달하여 객체를 찾아 옴
		if(account == null) {
			System.out.println("해당 계좌번호를 찾을 수 없습니다.");
			return; 
		}else {
			account.setBalance(account.getBalance()+money);
			//기존 계좌금액 + 키보드로 입력한 금액
			System.out.println("입금 성공 현재 잔액:"+  account.getBalance());
		}
		
		
		
		
		
		
	}

	private static Account findAccount(String ano) {
		// findAccount를 호출한 매개값으로 ano를 받아 배열에서 찾는다.
		Account account = null ; // 빈객체를 생성
		for(int i=0; i<accountArr.length ; i++) {
			if(accountArr[i] != null ) { //빈칸이 아니면
				String dbAno = accountArr[i].getAno();
				// 배열에서 ano값을 가져온다(0~99)
				if(dbAno.equals(ano)) {
					//dbAno는 배열에 있는 ano값
					//ano는 매개값을 전달받은 값 =일치하면 객체 리턴
					account = accountArr[i];
					System.out.println("찾은 객체 :" + account);
					break; //더이상 찾지 않는다. for문 종료 
				}//ano 같은값 찾아 객체 연결
			} //null 값이 아닌지 if문 종료
		}//배열 반복용 코드(ano를 찾아 객체로 반환)		
		
		return account;
	}

	private static void accountList() {
		// 배열에 있는 객체의 리스트를 출력한다.
		System.out.println("==================");
		System.out.println("======계좌목록======");
		System.out.println("==================");
		for(int i=0; i < accountArr.length ; i++) {
			Account account = accountArr[i];
			//이미 있는 객체를 찾아서 Account 객체에 연결
			if(account != null) { // null이 아니면 출력
				System.out.print("계좌번호 : " + account.getAno());
				System.out.print("\t 계좌주 : " + account.getOwner());
				System.out.print("\t 계좌금액 : " + account.getBalance());
				System.out.println();
			}
			
			
			
			
		} // 배열 반복용 코드 종료
		
		
		
	}

	private static void createAccount() {
		// 계좌생성용 동작(메서드)
		// 주메뉴에서 1을 누르면 계좌를 생성하는 메서드를 실행
		System.out.println("==================");
		System.out.println("======계좌생성======");
		System.out.println("==================");
		System.out.print("계좌번호 : ");
		String ano = in.next(); //문자열타입의 계좌번호 입력
		System.out.print("계좌주 : ");
		String owner = in.next() ; 
		System.out.print("초기 입금액 : ");
		int balance = in.nextInt() ;
		Account newAccount = new Account(ano, owner, balance);
		System.out.println("계좌주 : " + newAccount.getOwner());
		System.out.println("계좌번호 : " + newAccount.getAno());
		System.out.print("입금액 : " + newAccount.getBalance());
		System.out.println("로 계좌가 생성 됩니다.");
		
		for(int i = 0 ; i< accountArr.length ; i++) {
			if(accountArr[i] == null) {
				// accountArr배열의 빈칸을 찾는다.
				accountArr[i] = newAccount; //빈칸에 객체를 연결
				System.out.println("계좌생성 성공!!!!");
				break; // for문 중지
			}//if문 종료
						
			
			
		}//Account 배열에 빈칸을 찾아 객체를 연결함.
		
		
		
		
		
		
	}

}
