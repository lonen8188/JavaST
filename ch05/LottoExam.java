package ch05;

public class LottoExam {

	public static void main(String[] args) {
		// 로또 당첨 프로그램
		// 랜덤값으로 1~45의 숫자를 맞추세요
		
		int num1 = (int)(Math.random()*45) + 1 ;
		int num2 = (int)(Math.random()*45) + 1 ;
		int num3 = (int)(Math.random()*45) + 1 ;
		int num4 = (int)(Math.random()*45) + 1 ;
		int num5 = (int)(Math.random()*45) + 1 ;
		int num6 = (int)(Math.random()*45) + 1 ;
		int num7 = (int)(Math.random()*45) + 1 ;

		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " " + num7);
	}

}
