package ezen.interfacee;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	public int getVolume();
	
	
	
	
//	Java8버전부터 디폴트 메소드 추가
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거가 됩니다");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("음소거가 해제 됩니다");
		}
	}
	
	
//	static 메소드 추가
	public static void changeBattery() {
		System.out.println("배터리 교체가 필요합니다.");
	}
	
	
	
	
	
	
}
