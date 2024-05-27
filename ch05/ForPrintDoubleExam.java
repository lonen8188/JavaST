package ch05;

public class ForPrintDoubleExam {

	public static void main(String[] args) {
		// for문에서 2개의 변수를 동시에 증감....
		
		for(int i=0 , j=100 ; i<=10 && j >=90 ; i++, j-- ) {
			System.out.println("i값 확인 : " + i + "\t j값 확인 : " + j);
		}

	}

}
