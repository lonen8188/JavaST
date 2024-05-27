package ch13.generic.multi;

public class ProductExam {

	public static void main(String[] args) {
		// 제네릭을 이용하여 Product 구현
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV"); //세터이용해서 값 입력
		Tv tv = product1.getKind() ;
		String tvModel = product1.getModel(); 
		
		System.out.println(tvModel);
		
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("스포츠카"); // 입력
		Car car = product2.getKind();
		String carModel = product2.getModel(); //출력
		
		
		
		
	}

}
