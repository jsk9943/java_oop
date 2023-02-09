package ezen.interfacee;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(4);
		rc.setVolume(100);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println("전원 끄기 전 볼륨은 " + rc.getVolume());
		RemoteControl.changeBattery();
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(4);
		rc.setVolume(8);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println("전원 끄기 전 볼륨은 " + rc.getVolume());
		RemoteControl.changeBattery();
		
		
		
	}

}
