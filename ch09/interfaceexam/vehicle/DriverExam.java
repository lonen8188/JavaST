package ch09.interfaceexam.vehicle;

import java.util.Scanner;

public class DriverExam {

	public static void main(String[] args) {
		// Driver클래스에 drive메서드(매개변수의 다형성)
		Vehicle temp = null;
		Scanner in = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("출근길에 탈 것을 선택하세요");
		System.out.println("1. 버스 | 2. 택시");
		System.out.println("---------------------");
		System.out.print(">>>");
		int select = in.nextInt() ; 
		Driver driver = new Driver();
		switch (select) {
		case 1: //버스 
			temp = new Bus();
			// Vehicle vc = new Bus(); -> 다형성
			// 강제 타입 변환
			Bus bus = (Bus) temp; 
			bus.checkFare(1);
			bus.checkFare(2);
			bus.checkFare(3);
			
			break;
			
		case 2: //택시
			temp = new Taxi();
			// Vehicle vc = new Taxi(); -> 다형성
			break;
		
		default:
			//그외
			System.out.println("1~2번 값만 입력하세요");
		}
		driver.drive(temp);

	}

}
