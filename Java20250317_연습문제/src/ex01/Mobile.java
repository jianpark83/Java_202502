package ex01;

public abstract class Mobile {

	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile() {}
    public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
    /*
     * 추상메소드 => Moblie을 상속하는 객체는 반드시 추상메소드를 재정의해서 사용해라!!
     * 추상클래스 => 객체 생성할 수 없다
     */
	public abstract void operate(int time);   //body가 없기 때문에 abstract를 사용해서 추상화, 반드시!!
	public abstract void charge(int time);
	
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
}
