package ex01;

public interface RemoteControl {
//일반 메소드는 올 수 없다
	
//	(public static final) int MAX_VOLUME = 10;    앞에 생략됬다고 생각하면 됨
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	/*
	 * 인터페이스 상수
	 * 일반 멤버변수 생성 불가
	 * 정적변수만 생성 가능
	 */
	
	//추상 메소드 -> 무조건 구현(재정의)
	public void turnOn();  //객체는 생성할 수 없다
	
	//추가
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드 -> 구현해도 되고 구현하지 않아도 되고(재정의 선택 기능 부여)
	default void 신기능() {
		
	}
	
}
