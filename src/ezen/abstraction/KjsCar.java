package ezen.abstraction;

public class KjsCar extends Car {

	public KjsCar() {}
	
	public KjsCar(String name, String model, boolean status, int speed) {
		this.name = name;
		this.model = model;
		this.status = status;
		this.speed = speed;
	}
	
	@Override
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	@Override
	public void turnOn() {
		System.out.println("시동을 켭니다");
	}
	@Override
	public void run() {
		if(status == true) {
			System.out.println(getName() + getModel() + "이 정상입니다");
			System.out.println(getName() + getModel() + "이 잘 달립니다");
		} else {
			System.out.println(getName() + getModel() + "이 고장났습니다");
		}
	}
	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
		System.out.println("속도를 " + speed + "만큼 감소합니다.");
	}
	@Override
	public void speedUp(int speed) {
		this.speed += speed;
		System.out.println("속도를 " + speed + "만큼 증가합니다.");
	}
	@Override
	public void stop() {
		System.out.println(getName() + getModel() + "을 멈춥니다");
	}
	
}
