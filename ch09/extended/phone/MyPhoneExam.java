package ch09.extended.phone;

public class MyPhoneExam {

	public static void main(String[] args) {
		// phone 객체 활용 메서드
		SmartPhone cp = new SmartPhone("이젠폰", "핑크", 10, "kkw") ; 
		
		
		cp.powerOn(); //부모메서드
		System.out.println("환영합니다. " + cp.model);
		System.out.println("색상 : " + cp.color);
		cp.bell(); 
		cp.sendVoice("여보세요");
		cp.receiveVoice("안녕하세요 김기원입니다. ");
		cp.sendVoice("방갑습니다.");
		cp.receiveVoice("테스트종료합니다. bye bye");
		cp.hangup();//전화종료
		System.out.println("---------부모메서드--------");
		
		
		cp.turnOnDmb(); //자식메서드(dmbOn)
		cp.changeChannelDmb(6);
		cp.turnOffDmb(); 		
		cp.powerOff(); //부모메서드
		
	}

}
