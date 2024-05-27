package ch15.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExam1 {

	public static void main(String[] args) throws Exception {
		// Write는 저장에 느낌(자바에서 만든 자료를 파일화 시킴)
		OutputStream os = new FileOutputStream("d:/temp/test.txt");
		byte[] data = "가나다".getBytes();
		for(int i=0; i<data.length; i++) {
			os.write(data[i]); //파일에 byte로 저장
		}
		System.out.println("파일을 열여 보세요");
		os.flush(); //저장시 필수 1 (전송되지 않은 찌꺼기 데이터 마지막 전달)
		os.close(); //저정시 필수 2 (전송완료 후 닫음)
		
		
		
	}

}
