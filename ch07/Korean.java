package ch07;

public class Korean {//인스턴스용 객체 클래스(api)
	//필드(객체가 가지고 있는 값들)
	String nation =	"대한민국" ;
	String name ; //이름 
	String ssn ; //주민번호
	
	//생성자(new연산자로 초기값 처리용)
	public Korean(String name , String ssn) {
		this.name = name ;
		this.ssn = ssn ;
	}
	
	
	//메서드(동작 부분)
	
}
