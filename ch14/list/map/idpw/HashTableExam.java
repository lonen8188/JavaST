package ch14.list.map.idpw;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExam {

	public static void main(String[] args) {
		// 해시맵은 단일 스레드용, 해시테이블은 다중 스레드용
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345") ; // 객체 4개 생성(k=id,v=pw)
		
		Scanner in = new Scanner(System.in);
		
		while(true) { //끝값이 없는 반복자
			System.out.println("회원 로그인 화면 입니다.");
			System.out.print("아이디 : ");
			String id = in.next() ;
			System.out.print("암호 : " );
			String pw = in.next() ;
			System.out.println("-----검증중-----");
			
			if(map.containsKey(id)) { //.containsKey : key있는지 찾는다
				//id찾음
				System.out.println("입력하신 "+ id + " 가 존재합니다.");
				if(map.get(id).equals(pw)) {
					//id와같은 pw를 비교
					System.out.println("로그인 성공!!!");
				}else {
					//암호 다름
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
			
			
			
			
			
			
		}
	}

}
