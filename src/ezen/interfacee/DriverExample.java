package ezen.interfacee;

public class DriverExample {

	public static void main(String[] args) {
		Car car = new K3("κΈ°μ", "K3", false, 0);
		Driver driver = new Driver(car);

		driver.drive();
		
		car = new Avante("νλ", "Avante", false, 0);
		driver.setCar(car);
		driver.drive();
		
		
		
		
	}

}
