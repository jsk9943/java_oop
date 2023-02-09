package ezen.interfacee;

public class K3 implements Car {
	
	private String name;
	private String model;
	private boolean status;
	private int speed;
	
	public K3() {}
	
	public K3(String name, String model, boolean status, int speed) {
		this.name = name;
		this.model = model;
		this.status = status;
		this.speed = speed;
	}
	

	public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}

	public boolean isStatus() {
		return status;
	}

	public int getSpeed() {
		return speed;
	}

	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	
	
	@Override
	public void turnOn() {
		System.out.println("K3에 시동을 겁니다");
	}

	@Override
	public void turnOff() {
		System.out.println("K3에 시동을 끕니다");
	}

	@Override
	public void run() {
		System.out.println("K3가 현재 "+ speed +"km/h의 속도로 달립니다");
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
		System.out.println("K3가 " + speed + "km/h만큼 속도를 올렸습니다");
		System.out.println("K3가 " + this.speed + "km/h의 속도로 달립니다.");
	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
		System.out.println("K3가 " + speed + "km/h만큼 속도를 줄였습니다");
		System.out.println("K3가 " + this.speed + "km/h의 속도로 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("K3가 멈춥니다");
	}

}
