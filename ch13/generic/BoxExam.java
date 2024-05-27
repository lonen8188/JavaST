package ch13.generic;

public class BoxExam {

	public static void main(String[] args) {
		// Object를 사용한 타입변환 체크용
		
		Box<String> box = new Box<String>();
		box.set("홍길동"); //자동타입 변환(상속)
		String name = box.get(); //강제타입변환
		
		Box<Integer> box1 = new Box<Integer>();
		box1.set(11);
		Integer number = box1.get();
		double db = box1.get(); 
		
		Box<Apple> ap = new Box<Apple>();
		ap.set(new Apple());
		Apple apple = ap.get();
		
		

	}

}
