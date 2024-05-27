package ch14.list.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HashMapExam1 {

	public static void main(String[] args) {
		// Map인터페이스는 k,v의 쌍으로 구현된다.
		// key는 중복 안됨, v는 중복가능
		
		Map<String, Integer> map = new Hashtable<String, Integer>();
	
		map.put("김기원", 100);
		map.put("이태훈", 99);
		map.put("이서준", 50);
		map.put("손희신", 80);
		map.put("이태훈", 100); //key값이 중복 안됨, 마지막값이 남음)
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("=========전체엔트리출력(set)=========");
		//Set에 담에서 출력을 진행한다.
		Set<String> keyset = map.keySet(); //구슬주머니에 key값이 담긴다.
		Iterator<String> keyIt = keyset.iterator(); //구슬주머니를 반복자에 연결
		while(keyIt.hasNext()){ //구슬이 있으면 t, 없으면 f
			String key = keyIt.next() ; // 가져온 구슬을 key변수에 넣음
			Integer value= map.get(key) ; // 맵에 담긴 곳에서 key와 같은 value를 가져옴
			System.out.println("\t" + key + " : " + value);
		}
		
		System.out.println("======이서준key값=======");
		System.out.println("\t" + map.get("이서준"));
		
		System.out.println("======김기원삭제=========");
		map.remove("김기원");
		System.out.println("총 Entry 수 : " + map.size());
		
		
		System.out.println("=========전체엔트리출력(entryset)=========");
		Set<Map.Entry<String, Integer>> etset = map.entrySet();
		//전체 객체를 하나씩 처리
		Iterator<Map.Entry<String, Integer>> etIt = etset.iterator(); //반복자
		while(etIt.hasNext()) { //다음객체가 있으면 t, 없으면 f
			Map.Entry<String, Integer> entry = etIt.next() ; // 객체 가져와 넣음(k,v)
			String key = entry.getKey(); // 키값을 넣음
			Integer value = entry.getValue() ; //값을 넣음
			System.out.println("\t" + key + " : " + value);
			// Set<Map.Entry<String, Integer>> -> 키와 값을 동시에 가져옴
		} 
		
		
		
		
		
		
		

	}

}
