package ezen.interfacee;

public class DriverExample {

	public static void main(String[] args) {
		Car car = new K3("기아", "K3", false, 0);
		Driver driver = new Driver(car);

		driver.drive();
		
		car = new Avante("현대", "Avante", false, 0);
		driver.setCar(car);
		driver.drive();
		
		
		
		
	}

}
