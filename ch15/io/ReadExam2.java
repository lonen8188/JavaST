package ch15.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExam2 {

	public static void main(String[] args) throws Exception {
		// read(byte[3]) -> 바이트배열 3칸짜리를 이용한다.
		// 1개의 byte 처리보다 빠른 처리가 가능
		
		InputStream is = new FileInputStream("d:/temp/test.txt");
		int readByteNo ; 
		byte[] readBytes = new byte[5]; // 배열 3칸 지정
		String data = ""; 
		while(true) {
			readByteNo = is.read(readBytes); 
			// int readByteNo = is.read(new byte[3]); 
			if(readByteNo == -1) {
				//이후 자료 없음
				break;
			}else {
				//자료 있음
				data += new String(readBytes, 0, readByteNo);
				System.out.println(data);
			}
			
			
		}//반복하여 읽기 테스트
		is.close(); // 파일 닫기		
		

	}

}
