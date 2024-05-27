package ch09.interfaceexam;

import java.util.Scanner;

public class RemoteControlExam {

	public static void main(String[] args) {
		// 인터페이스와 구현체의 실행 실습
		// RemoteControl rc = new RemoteConrol(); 인터페이스는 객체 생성 안됨
		// 무조건 구현 class를 만들어 실행해야 한다.(tv, audio)
		Televison tv = new Televison();
		tv.turnOn(); // 전원켬
		tv.setMute(true);
		tv.setMute(false);
		tv.setVolume(15);
		tv.setVolume(-4);
		tv.setVolume(5);
		tv.turnOff(); // 전원끔
		System.out.println("------------------------");
		Audio ad = new Audio();
		ad.turnOn(); // 전원켬
		ad.setMute(true);
		ad.setMute(false);
		ad.setVolume(15);
		ad.setVolume(-4);
		ad.setVolume(5);
		ad.turnOff(); // 전원끔
		System.out.println("------------다형성---------------");

		RemoteControl rc; // 인터페이스 타입으로 변수를 선언
		Scanner in = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println("1. TV | 2. Audio | 3. SmartTV");
		System.out.println("--------------------------------");
		System.out.print(">>");
		int select = in.nextInt(); // 키보드 입력
		if (select == 1) { // tv일때
			rc = new Televison(); // RemoteControl rc = new Televison();
			rc.turnOn();
			rc.turnOff();
			rc.setMute(false);
			rc.setMute(true);
			RemoteControl.changeBattery(); //정적메서드 실행
		} else if (select == 2) { // audio
			rc = new Audio(); // RemoteControl rc = new Audio();
			rc.turnOn();
			rc.turnOff();
		} else if (select == 3) { // audio
			rc = new SmartTV(); // RemoteControl rc = new Audio();
			rc.turnOn();
			rc.turnOff();
			Searchable se = new SmartTV();
			se.search("www.naver.com");

		} else {		// 잘못 입력일 때
			System.out.println("1~3번만 입력하세요");
		}

	}

}
