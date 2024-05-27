package ch09.extended.promotion.car;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// 자동차 주행 및 타이어 교환 코드
		Car myCar = new Car(); //자동차 객체 생성 -> 타이어 생성4개
		Scanner in = new Scanner(System.in);
		for(int i = 1 ; i<=30 ; i++) { //30키로 주행
			int problemLocation = myCar.run();//1키로 주행
			
			switch(problemLocation) {
			case 1 : //앞왼쪽 타이어 문제
				System.out.println("교체할 타이어를 선택하세요");
				System.out.println("1. 한국타이어(20만원), 2. 금호타이어(15만원), 3.OEM타이어(13만원)");
				System.out.print(">>>");
				int select = in.nextInt();
				if(select == 1) {
					System.out.println("앞왼쪽한국타이어로 교체합니다.");
					myCar.frontLeftTire = new HankookTire("한국앞왼쪽", 30);
					//Tire frontLeftTire = new Tire("앞왼쪽",10);
					//Tire frontLeftTire = new HankookTire("한국앞왼쪽", 30);
					
					
					
					
				}else if(select == 2) {
					System.out.println("앞왼쪽금호타이어로 교체합니다.");
					myCar.frontLeftTire = new kumhoTire("금호앞왼쪽", 25);
					//Tire frontLeftTire = new Tire("앞왼쪽",10);
					//Tire frontLeftTire = new HankookTire("한국앞왼쪽", 30);
				}else {
					System.out.println("앞왼쪽oem타이어로 교체합니다.");
					myCar.frontLeftTire = new Tire("앞왼쪽", 20);
					
				}
				break;
			case 2 : //앞오른쪽 타이어 문제
				break;
			case 3 : //뒤왼쪽타이어 문제
				break;
			case 4 : //뒤오른쪽타이어 문제
				break;
			}
		}

	}

}
