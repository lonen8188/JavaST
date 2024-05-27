package ch09.extended.promotion.car;

import java.sql.Date;

public class kumhoTire extends Tire{
	//필드
	public String name = "Snow Tire" ;
	public int Rim ; //휠 사이즈
	public Date CreateDate ; 
	
	
	//생성자
	public kumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// 부모생성자 자동 생성
	}


	@Override
	public boolean roll() {
		accRotation += 1.2 ; //누적 회전수 증가용(기본값)
		if(accRotation < maxRotation) {
			//주행가능
			System.out.println(location + "금호타이어수명 :" 
			+ (maxRotation-accRotation) + " 마일리지가 남앗습니다.");
			return true ;
			
		}else {
			//주행 불가능
			System.out.println("***** 경고 " + location + " 금호타이어펑크(마일리지 소모)*****");
			return false ;
		}
	}
	
	public boolean maxSpeed() {
		System.out.println("타이어 최고 속도 초과 경고!!!!");
		 return true;
	}
	
	
}
