package ezen.carExample;

public class CarRun {

	public static void main(String[] args) {
		Tire tire = new Tire();
		Car car = new Car();
		car.setTire(tire);
		car.run();
		car.setTire(new KumhoTire());
		car.run();
		car.setTire(new HankookTire());
		car.run();
	}

}
