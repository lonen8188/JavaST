package ch09.interfaceexam.vehicle;

public class Taxi implements Vehicle{ //구현객체

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");		
	} //구현객체

}
