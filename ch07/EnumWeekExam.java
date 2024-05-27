package ch07;

import java.util.Calendar;

public class EnumWeekExam {

	public static void main(String[] args) {
		// Enum테스트용 메인 메서드
		/*
		 * Week today = Week.SATURDAY ; System.out.println(today == Week.SATURDAY);
		 * 
		 * Week week1 = Week.SUNDAY ; Week week2 = Week.SUNDAY ;
		 * System.out.println(week1 == week2);
		 */

		Week today = null; // today변수는 Week타입을 쓰겟다.!!

		Calendar cal = Calendar.getInstance();// 달력 객체를 생성
		int year = cal.get(Calendar.YEAR);
		System.out.println("현재년도는 : " + year);
		int month = cal.get(Calendar.MONTH) + 1; // MONTH는 0부터 1월이다.
		System.out.println("현재 월은 : " + month + "월 입니다.");
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("현재 일은 : " + day + "일 입니다.");
		int week = cal.get(Calendar.DAY_OF_WEEK);
		

		switch (week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TESUDAY; break;
		case 4:
			today = Week.WEDNESDAY ; break;
		case 5:
			today = Week.THURSDAY ; break;
		case 6:
			today = Week.FRIDAY ; break;
		case 7:
			today = Week.SATURDAY ; break;
		}
		System.out.println("현재 요일은 : " + today + "일 입니다.");
	}

}
