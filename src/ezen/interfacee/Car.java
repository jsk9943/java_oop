package ezen.interfacee;
/**
 * 
 * @author 김정석
 * @date   2023. 1. 6.
 * 자동차 명세
 *
 */
public interface Car {

	public void turnOn();
	public void turnOff();
	public void run();
	public void speedUp(int speed);
	public void speedDown(int speed);
	public void stop();
}
