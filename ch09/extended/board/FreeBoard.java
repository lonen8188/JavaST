package ch09.extended.board;

public class FreeBoard extends Board{ //Board class의 자식클래스
	//필드
	private String comment ;
	private int visitCount ;
	
	//생성자
	
	
	//메서드
		
	public String getComment() {
		return comment;
	}
	public int getVisitCount() {
		return visitCount;
	}
	public void setComment(String comment) {
		//욕설이나 비방 체크
		this.comment = comment;
	}
	public void setVisitCount(int visitCount) {
		//평점관리용
		this.visitCount = visitCount;
	}  
	
	
	

}
