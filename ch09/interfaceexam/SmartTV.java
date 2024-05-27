package ch09.interfaceexam;

public class SmartTV implements RemoteControl, Searchable {
	//인터페이스를 사용할 객체(구현객체)
	// 다중 인터페이스 사용(인터페이스에 있는 추상메서드 강제 사용)
	private int volume ; 
	
	@Override
	public void search(String url) { //Searchable인터페이스 추상메서드 
		System.out.println(url + " 주소를 검색합니다."); 	}

	@Override
	public void turnOn() { // RemoteControl 인터페이스 추상메서드
		System.out.println("스마트 tv 전원을 켭니다.");	}

	@Override
	public void turnOff() {// RemoteControl 인터페이스 추상메서드
		System.out.println("스마트 tv 전원을 끕니다.");	}

	@Override
	public void setVolume(int volume) {// RemoteControl 인터페이스 추상메서드
		if (volume > RemoteControl.MAX_VOLUME) {
			// 인터페이스에 선언된 최대볼륨보다 크면
			this.volume = RemoteControl.MAX_VOLUME ;
			
		} else if (volume < RemoteControl.MIN_VOLUME) {
			// 인터페이스에 선언된 최소볼륨보다 작으면
			this.volume = RemoteControl.MIN_VOLUME ;
		} else {
			// 정상볼륨이면
			this.volume = volume ;
		}//볼륨 비교 if 문
		
		System.out.println("현재 스마트 tv의 볼륨 : " + this.volume);
		
	} 

}
