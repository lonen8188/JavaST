package ch08.getter_setter;

public class RegExam {

	public static void main(String[] args) {
		// 게터/세터를활용한 인스턴스 연습용
		Reg reg = new Reg();
		Reg regAll = new Reg("김기원","kkw", "1234", "Email@nate.com", "수원" );
		
		reg.setName("이태훈");
		reg.setId("leeth");
		reg.setPw("1234");
		
		System.out.println("regAll 값 출력 : name " + regAll.getName() );
		
				

	}

}
