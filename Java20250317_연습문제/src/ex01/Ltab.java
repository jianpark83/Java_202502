package ex01;

public class Ltab extends Mobile {

	public Ltab() {}
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	@Override
	public void operate(int time) {
		//사용을 통해 배터리 감소 구현
		//1분 사용 시 배터리 10 감소
		int size = getBatterySize();
		size += time*-10;
		setBatterySize(size);
	}
	
	@Override
	public void charge(int time) {
		//충전을 통한 배터리 증가 구현
		//1뷴 츙존 사 배터리 10 증가
		int size = getBatterySize();
		size += time*10;
		setBatterySize(size);
	}
}
