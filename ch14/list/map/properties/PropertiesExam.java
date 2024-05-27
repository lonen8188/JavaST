package ch14.list.map.properties;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) throws Exception {
		// 프로퍼티로 만든 텍스트를 k,v형식으로 불러오는 기법
		Properties pp = new Properties(); //객체 생성
		String path = PropertiesExam.class.getResource("database.properties").getPath();
		System.out.println(path); //PropertiesExam.java가 있는 위치(경로)파일이름을 String 넣음
		path = URLDecoder.decode(path, "utf-8"); //파일 인코딩
		pp.load(new FileReader(path)); //찾은 경로와 파일명으로 불러오기
		
		
		String driver = pp.getProperty("driver") ; //driver키를 이용한 값을 넣음
		System.out.println("드라이버 :" + driver);
		String url = pp.getProperty("url") ;
		System.out.println("URL : " + url);
		String id = pp.getProperty("username") ; 
		System.out.println("ID : " + id);
		String pw = pp.getProperty("password") ;
		System.out.println("PW : " + pw);
				
				
				
				
	}

}
