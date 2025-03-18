package ex01;

public class RemoteTest {

	public static void main(String[] args) {
		RemoteControl remote = new Television();
		
		remote.turnOn();
		remote.turnOff();
		remote.setVolume(7);
		
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		
		RemoteControl remote1 = new Radio();
		
		remote1.turnOn();
		remote1.turnOff();
		remote1.setVolume(5);
	}
}
