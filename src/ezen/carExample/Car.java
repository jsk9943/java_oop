package ezen.carExample;

public class Car {
	
	private Tire tire = new Tire();
	
	
	public Car() {
	}




	public Car(Tire tire) {
		this.tire = tire;
	}
	
	


	public Tire getTire() {
		return tire;
	}




	public void setTire(Tire tire) {
		this.tire = tire;
	}

	
	public void run() {
		tire.usedTire();
		System.out.println("차량이 달립니다");
	}


}
