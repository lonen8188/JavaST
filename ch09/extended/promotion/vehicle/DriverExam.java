package ch09.extended.promotion.vehicle;

public class DriverExam {

	public static void main(String[] args) {
		// Driver에서 매개값으로 다형성 테스트
		Driver dr = new Driver();
		dr.drive(new Vehicle());
		dr.drive(new Bus());
		dr.drive(new Taxi());
		
		

	}

}
