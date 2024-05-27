package ch10.cientexception;

import java.util.Scanner;

public class LoginExam {

	public static void main(String[] args) {
		// id와 pw를 검증하여 예외 처리 3
		Scanner in = new Scanner(System.in);
		System.out.println("id를 입력하세요");
		System.out.print(">>>");
		String id = in.next(); //id키보드로 입력 받음
		System.out.println("pw를 입력하세요");
		System.out.print(">>>");
		String pw = in.next() ; // pw키보드로 입력 받음
		
		try {
			login(id, pw); //예외발생가능 4 -> 10(try)
			//정상처리
			System.out.println(id + "님 환영합니다. 로그인 성공!!!");
			
		} catch (NotExistIdException e) {  //11
			System.out.println(e.getMessage()); //id실패 예외 메시지 출력
		} catch (WrongPasswordException e) { //12
			System.out.println(e.getMessage()); //pw실패 예외 메시지 출력
		}

	}

	private static void login(String id, String pw)  //5
			throws NotExistIdException, WrongPasswordException { 
		// id 검증과 pw 검증을 예외처리로 진행
		if(!id.equals("kkw")) { //6
			//kkw가 들어온 값이 아니면
			throw new NotExistIdException("아이디가 존재하지 않습니다."); //7
		} //id검증 예외 처리
		
		if(!pw.equals("12345")) {  //8
			//암호가 12345가 아니면
			throw new WrongPasswordException("패스워드가 다름니다."); //9
		} //pw 검증 예외처리
		
		
		
		
		
		
		
		
		
		
		
	}

}
