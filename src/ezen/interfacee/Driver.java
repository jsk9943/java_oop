package ezen.interfacee;

public class Driver {
	
	private Car car;  // 인터페이스 선언
	
	public Driver() {}
	
	public Driver(Car car) {
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
	

	public void drive() {
		car.turnOn();
		car.run();
		car.speedUp(80);
		car.speedDown(20);
		car.run();
		car.stop();
		car.turnOff();
	}
	
}
