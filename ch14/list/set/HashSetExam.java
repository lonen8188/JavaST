package ch14.list.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		// Set 컬렉션은 구슬주머니처럼 인덱스가 없는 객체들이 들어 있다.
		// 객체를 찾을 때 반복적으로 찾는 iterator를 활용 필수
		// 들어갈때 객체와 나올때 객체의 순서는 랜덤이다.
		// HashSet은 이미 저장되어 있는 객체들의 해시코드를 비교(@49720s)
		// Set은 동일 객체가 들어갈 수 없다.
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("Java") ; //객체 생성하여 구슬주머니에 넣는다.
		set.add("JDBC") ;
		set.add("Servlet/Jsp") ;
		set.add("Java") ; //첫줄과 동일한 객체(1번만 저장됨)
		set.add("myBatis") ;
		
		int size = set.size() ; // 저장된 객체 수 얻기
		System.out.println("현재 객체수 :" + size );
		
		//전체 객체 출력
		System.out.println("=======모든객체출력==========");
		Iterator<String> it = set.iterator(); //반복자 인터페이스를 사용하여 set과 연결
		while(it.hasNext()) { //.hasNext()는 다음 객체가 있는지 판단
			// .hasNext()는 다음 객체가 있으면 true, 없으면 false
			String element = it.next(); //가져온 객체를 변수에 넣음
			System.out.println("\t " + element);
			
		} //반복자를 이용한 출력 종료
		
		
		set.remove("JDBC");
		
		System.out.println("현재 객체수 :" + set.size());
		
		
		for(String element : set) {
			System.out.println("\t " + element);
		}  // 향상된 for으로 전체 출력을 할 수 있다.
		
		
		

	}

}
