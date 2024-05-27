package ch09.extended.abstractexam.overrading;

public abstract class Animal {//추상메서드(조장이 만듬)
	//필드
	public String kind ;
	
	//생성자
	public Animal() {}; //기본생성자
		
	//메서드
	public abstract void sound();
	//추상 메서드, 중괄호 블럭이 없이 ;으로 마감
	//조원이 강제로 {실행문}추가 하게 끔 한다.
	
}
