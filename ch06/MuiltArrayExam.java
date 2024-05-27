package ch06;

public class MuiltArrayExam {

	public static void main(String[] args) {
		// 다차원 배열(2차원)은 행열구조로 되어 있는 표
		// int[][] scores = new int[][];
		// 앞에있는 대괄호는 행, 뒤에있는 대괄호는 열로 삽입
		int[][] scores = new int [2][3] ; // 2x3 행렬
		
		System.out.println("행의 칸 개수를 확인 : " + scores.length);
		System.out.println("0열의 칸 개수를 확인 : " + scores[0].length);
		System.out.println("1열의 칸 개수를 확인 : " + scores[1].length);
		
		
		int[][] scores1 = new int[2][]; // 2행 설계
		scores1[0] = new int[2]; // 2열 설계
		scores1[1] = new int[3]; // 3열 설계 
		

		System.out.println("행의 칸 개수를 확인 : " + scores1.length);
		System.out.println("0열의 칸 개수를 확인 : " + scores1[0].length);
		System.out.println("1열의 칸 개수를 확인 : " + scores1[1].length);
	}

}
