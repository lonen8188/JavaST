package ch07;

public class Television {
	//정적필드 -> 선언과 동시에 초기값을 주는 것이 관례임.
	static String company = "Samsung";
	static String model = "LED 55인치";
	static String info ; // 초기값 없다.
	
	//생성자x -> 정적블럭
	static { // 정적맴버는 구동시 자동으로 만들어 짐. 
		info = company + "-" + model;
	} // 정적블럭 종료
	
	
	
	
	//정적메서드
}
