package ezen.abstraction;


public class CarAbstraction {

	public static void main(String[] args) {
		Car car = new KjsCar("제네시스", "G90", true, 50);
		car.turnOn();
		System.out.println("차의 현재속도는 " + car.getSpeed() + "입니다.");
		car.speedUp(100);
		car.speedDown(50);
		System.out.println("차의 현재속도는 " + car.getSpeed() + "입니다.");
		car.run();
		car.setStatus(false);
		car.run();
		car.stop();
		car.turnOff();
		
		
		
	}

}
