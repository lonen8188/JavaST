package ch04;

public class DenyLogicExam {

	public static void main(String[] args) {
		// 변수앞에 !를 붙이면 부정(반전)으로 동작함
		boolean play = true ; //참 값
		System.out.println(play);
		
		play = !play ;
		System.out.println(play);
		
		play = !play ;
		System.out.println(play);
		
	}

}
