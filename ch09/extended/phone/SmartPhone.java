package ch09.extended.phone;

public class SmartPhone extends DmbPhone{
	//필드
	String Search ;
	String owner; 
	
	//생성자
	SmartPhone(String model, String color, int channel, String owner){
		super(model, color, channel);
		this.owner = owner;
	}
	
	//메서드
	

}
