package ch10.trycatch;

public class FileInputStExam implements AutoCloseable {
	//implements AutoCloseable 내장된 자동닫기 인터페이스 구현 객체임
	//필드
	private String file ; //파일명
	
	//생성자
	public FileInputStExam(String file) {
		this.file = file ;
	}//객체 생성시 파일명을 전달받아 file 필드에 넣는다.
	
	//메서드
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}

	@Override//인터페이스에서 강제 받은 추상 메서드 재정의
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
		
	}
	
	
	
	
}
