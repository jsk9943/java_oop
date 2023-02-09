package ezen.interfacee;

public class Audio implements RemoteControl {
	
	private int volume;
	private int memoryVolume;


	public Audio() {}
	
	@Override
	public int getVolume() {
		return volume;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨은 " + getVolume());
	}
	
//	디폴트 메소드 오버라이딩
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			memoryVolume = volume;
			System.out.println("음소거가 됩니다");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("음소거가 해제 됩니다");
			setVolume(memoryVolume);
		}
	}
	
}
