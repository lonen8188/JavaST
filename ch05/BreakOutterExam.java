package ch05;

public class BreakOutterExam {

	public static void main(String[] args) {
		//break문에 라벨을 붙이면 반복코드 종료시점을 정할 수 있다.
		for(char upper='A' ; upper <= 'Z' ; upper++) { //A~Z까지 반복용 코드
			Outter : for(char lower='a' ; lower <= 'z' ; lower++) { //a~z까지 반복용 코드
				
				System.out.println(upper + "-" + lower);
				if(lower=='c') {
					break Outter;
				}
			}//소문자 반복문 종료
		}// 대문자 반복문 종료

	} // main() 메서드 종료

} // 클래스 종료
