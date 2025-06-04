package ex01;

public class TV {
	private String model;
	private int size;
	private int channel;

	public TV() {}

	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}
	
	public void channelUp() {
		channel++;
		if (channel >10) {
			channel = 1;
		}
		//channel = channel > 10 ? 1 : channel++;  삼항연산자
	}
	
	public void channelDown() {
		channel--;
		if (channel < 10) {
			channel = 10;
		}
		//channel = channel < 1 ? 10 : channel--;  삼항연산자
	}
	
	public String getModel() {
		return model;
	}

	public int getSize() {
		return size;
	}

	public int getChannel() {
		return channel;
	}
}
