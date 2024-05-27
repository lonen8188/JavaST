package ch15.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExam1 {

	public static void main(String[] args) throws Exception {  //예외처리 필수
		// InputStream은 byte를 이용하여 데이터를 자바로 입력받는다.
		// read(); 메서드는 int(32bit)타입의 byte(8bit)객체로 읽어 옴
		// read()메서드는 int타입의 1바이트씩 읽고 결과를 출력
		
		InputStream is = new FileInputStream("d:/temp/test.txt");
		int readByte ;
		while(true) {
			readByte = is.read(); // int readByte = is.read();
			if(readByte == -1) {
				break; //readByte 안에 -1값이 넘어 오면 더이상 자료가 없다.
			}else {
				// -1아니기 때문에 자료가 있다.
				System.out.println((char)readByte); //가져온 정보 출력
			}// 자료 유무를 판단
		} // 파일에 있는 자료가 있을때까지 반복 (-1값이 넘어오면 없다)
		is.close() ; // 파일처리 끝
	}

}
