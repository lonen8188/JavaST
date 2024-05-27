package ch14.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		// list는 배열과 유사하지만 초기배열값을 정하지 않음
		// 기본은 10칸이지만 자동으로 추가 된다. 
		// 처음에 30칸으로 만들고 싶으면 객체 생성시 (30)로 활용 됨
		// 제네릭을 사용하기 때문에 같은 타입으로 생성 해야 한다.
		List<String> list = new ArrayList<String>();
		// 리스트 타입의 어레이리스트 객체 생성-> String 타입으로 강제 적용
		// 자동타입 변환과 강제타입 변환이 필요 없어 성능이 좋다.
		
		list.add("Java"); // list[0]
		list.add("JDBC");
		list.add("Servlet");
		list.add("JSP");
		list.add("Spring") ;
		list.add("Spring Boot");
		list.add(2, "Oracle"); //2번에 삽입
		list.add("MyBatis");
		list.add("JPA");
		
		int size = list.size(); //list개수
		System.out.println("총 객체수 :" + size);
		
		
		String skill = list.get(2);
		System.out.println("2번 인덱스 값 : " + skill);
		
		for(int i=0 ; i<list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
			
		} // list는 size로 최대 객체 수를 파악한다.
		System.out.println();
		list.set(3, "tomcat");
		
		for(int i=0 ; i<list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
			
		}

		System.out.println();
		list.remove(1) ;  //인덱스로 제거
		for(int i=0 ; i<list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
			
		}
		
		
		System.out.println();
		list.remove("MyBatis");
		for(int i=0 ; i<list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
			
		}
		
		
		
	}

}
