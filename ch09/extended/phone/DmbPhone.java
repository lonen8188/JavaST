package ch09.extended.phone;

public class DmbPhone extends CellPhone{ //2000년대에 유행하던 전화기
	//자식 라이브러리 클래스
	int channel ; 
	
	//생성자(기본생성자없음)
	DmbPhone(String model, String color, int channel){
		super(); //생략
		this.model = model ;
		this.color = color ; //부모객체
		this.channel = channel ; //내꺼
		
	}
	
	//자식 메서드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송이 시작됩니다.");
	} //dmb방송시작용 메서드
	
	void changeChannelDmb(int channel) {
		this.channel = channel ;
		System.out.println("채널을 " + channel + "번으로 변경합니다.");		
	} //dmb채널 변경용 메서드
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료 합니다.");
	} //dmb방송종료 메서드
	
	
	
	
	
	
	

}
