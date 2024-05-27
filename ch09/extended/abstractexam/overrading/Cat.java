package ch09.extended.abstractexam.overrading;

public class Cat extends Animal {//실체 클래스(조원용) 

	
	public Cat() {
		this.kind = "포유류";
	} //생성자
	
	
	@Override //조장이만든 메서드를 강제로 주입
	public void sound() {
		// 조원이 쓰고싶은 실행문...
		System.out.println("야아이옹야!!!!");
	} 

}
