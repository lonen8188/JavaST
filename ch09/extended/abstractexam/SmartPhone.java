package ch09.extended.abstractexam;

public class SmartPhone extends Phone {
	//실체 클래스(추상용), 조원이 추가로 만듬
	//필드
	//생성자
	public SmartPhone(String owner) {
		super(owner);
		// 부모(추상클래스)에서 강제로 만들어 놓은 생성자
		//SmartPhone sp = new SmartPhone("김기원")
	} 
	//메서드 -> 조원이 추가로 만든 메서드
	public void internetSearch() {
		System.out.println("인터넷 검색 시작");
	}
	

}
