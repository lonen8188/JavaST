package ch15.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExam3 {

	public static void main(String[] args) throws Exception {
		// read(byte[8], 2(off), 3(len))
		// 8개의 배열을 선언하고 2번째부터 3개의 값을 가져온다.
		
		InputStream is = new FileInputStream("d:/temp/test.txt");
		int readByteNo ;
		byte[] readBytes = new byte[8];
		readByteNo = is.read(readBytes, 2, 3);
		// int readByteNO = is.read(new byte[8]);
		
		for(int i = 0 ; i < readBytes.length ; i++ ) {
			System.out.println((char)readBytes[i]);
		}

		is.close();
		
		
		
		
		
	}

}
