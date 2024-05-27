package ch06;

public class ArrayInArrayExam {

	public static void main(String[] args) {
		// 행열구조의 입력은 행부터 열까지 입력

		int[][] mathScores = new int[][] { { 60, 70, 80 }, { 70, 80, 90 } };
		// 출력하려면 행반복, 열반복을 진행
		
		for(int 열 = 0 ; 열 < mathScores.length ; 열++) {
			for(int 행 = 0 ; 행 < mathScores[열].length; 행++) {
			    System.out.print(mathScores[열][행] + " ");	
			}//열반복 종료
			System.out.println("---------------------");
		}//행반복 종료
		
		
		
		

	}

}
