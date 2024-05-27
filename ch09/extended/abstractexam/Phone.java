package ch09.extended.abstractexam;

public abstract class Phone { 
	//추상클래스로 선언(abstract)
	//조장이 가이드를 만들어 줌.
	
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}; //기본생성자 사용 안함, owner 값을 입력받아 객체를 생성
	// Phone ph = new Phone("김기원");
	
	
	//메서드 -> 조장이 가이드한 메서드
	public void turnOn() {
		System.out.println("폰의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰의 전원을 끕니다.");
	}
	

	
	
	
	
	
}
