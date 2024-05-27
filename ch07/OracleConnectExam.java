package ch07;

public class OracleConnectExam {

	public static void main(String[] args) {
		// JDBC 연결 테스트용 코드
		String Driver = "oracle.jdbc.driver.OracleDriver" ;
		String url = "localhost:1521:orcl";
		String id = "kkw" ;
		String pw = "kkwpw";	
				
		OracleConnect oc = new OracleConnect(Driver, url, id, pw);
		
		
		
		

	}

}
