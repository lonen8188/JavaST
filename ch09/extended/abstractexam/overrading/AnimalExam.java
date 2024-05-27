package ch09.extended.abstractexam.overrading;

import java.util.Scanner;

public class AnimalExam {

	public static void main(String[] args) {
		// 강제상속 테스트
		// Animal an = new Animal(); 추상클래스

		Dog dog = new Dog(); // 자식클래스
		dog.sound();

		Cat cat = new Cat(); // 자식클래스
		cat.sound();
		System.out.println("-------------");
		System.out.println("강제,자동타입변환");

		Animal an = null;
		Scanner in = new Scanner(System.in);
		System.out.println("1. 강아지 | 2. 고양이");
		System.out.print(">>>");
		int selete = in.nextInt();
		if (selete == 1) {
			an = new Dog();
		} else if (selete == 2) {
			an = new Cat();
		}
		an.sound();
		
		
		System.out.println("-------------");
		System.out.println("매개변수의 다형성");
		//매개변수의 다형성은 메서드의 매개값 부분에 부모타입을 지정
		animalSound(new Dog());
		animalSound(new Cat());
						
	}

	private static void animalSound(Animal an) {
		an.sound();		
	}

}
