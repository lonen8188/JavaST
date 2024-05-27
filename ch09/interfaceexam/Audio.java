package ch09.interfaceexam;

public class Audio implements RemoteControl {// implements RemoteControl 인터페이스의 구현 객체임을 명시
	// 필드
	private int volume; // setVolume에서 사용된 필드

	@Override
	public void turnOn() {
		System.out.println("오디오의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오의 전원을 끕니다.");
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
		
		System.out.println("현재 오디오의 볼륨 : " + this.volume);
	} //setVolume메서드 종료

	
	
	
	
}
