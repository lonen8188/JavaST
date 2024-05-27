package ch09.extended.phone;

public class CellPhone {  //초창기 전화기(할아버지)
	String model ;
	String color ; 
	
	//기본생성자(자동)
	CellPhone(){}  // CellPhone cp = new CellPhone();
	
	//메서드 
	void powerOn() { System.out.println("전원을 켭니다."); }
	void powerOff() {System.out.println("전원을 끕니다."); }
	void bell() {System.out.println("벨이 울립니다. : 띠리링");	}
	void sendVoice(String message) {System.out.println("나 : " + message);}
	void receiveVoice(String message) {System.out.println("상대방 : " + message);	}
	void hangup() {System.out.println("전화를 끊습니다.");}
	
	
	
	
	

}
