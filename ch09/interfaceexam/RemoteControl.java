package ch09.interfaceexam;

public interface RemoteControl { 
	//인터페이스는 대부분 api용으로 사용됨
	//객체를 요청하면 객체를 전달하는 용도
	//구성맴버는 상수와 메서드만 존재
	//메서드
		//추상메서드 : 조장이 강제로 만드는 {}가없는 메서드
		//디폴트메서드 : 같은 패키지만 허용
		//정적메서드 : static으로 선언한 객체없이 사용하는 메서드
	
	//상수 : 데이터를 저장할 수 있는 필드를 선언할 수 없다.(고정값)
	public static final int MAX_VOLUME = 10; //초기값이 무조건 필요함
	public int MIN_VOLUME = 0 ; // static final 생략가능(기본임)
	//관례 : 상수명은 대문자, 단어간에는 _ 
	
	//메서드
	//추상메서드, abstract 생략시 기본(조장이 선언만, 조원이 실행문 만듬)
	public abstract void turnOn(); //전원켬
	public  void turnOff() ; // 전원끔
	public  void setVolume(int volume); // 볼륨 조절
		
	
	//디폴트메서드 (default 명시, 생략시 abstract로 생성됨)
	default void setMute(boolean mute) {
		if(mute) {
			//true
			System.out.println("음소거가 활성화 됩니다. : 소리 안남");
		}else {
			//false
			System.out.println("음소거가 비활성화 됩니다. : 소리 남");
		}//if문 종료
	}//setMute()메서드 종료
	// default는 기본적으로 public이기 때문에 생략 가능
	
	
	//정적메서드 (객체 없이 사용가능) -> RemoteControl.method3()
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	} //정적메서드는 기본적으로 public이기 때문에 생략 가능
	
	
	
	
	
	
	
	
	

}
