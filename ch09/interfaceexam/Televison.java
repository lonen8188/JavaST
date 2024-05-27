package ch09.interfaceexam;

public class Televison implements RemoteControl {// implements RemoteControl 인터페이스의 구현 객체임을 명시
	// 필드
	private int volume; // setVolume에서 사용된 필드

	@Override
	public void turnOn() {
		System.out.println("TV의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV의 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
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
		
		System.out.println("현재 tv의 볼륨 : " + this.volume);
	} //setVolume메서드 종료

	@Override
	public void setMute(boolean mute) {
		if(mute) {
			//true
			System.out.println("TV의 음량이 음소거 됩니다. : 소리 안남");
		}else {
			//false
			System.out.println("TV의 음량이 음소거 취소 됩니다. : 소리 남");
		}//if문 종료
	}

	
	
	
	
}
