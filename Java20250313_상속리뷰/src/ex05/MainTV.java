package ex05;

public class MainTV {

	public static void main(String[] args) {

		TV tv =  new SamsungTV();  //tv가 참조하고 있는게 SamsungTV이기 때문에
		
		tv.powerOn();              //SamsungTV 메소드가 출력된다
		tv.powerOff();
		
		tv.volumeUp();
		tv.volumeDown();
		
        TV tv1 =  new LgTV();       //tv1이 참조하고 있는게 LgTV이기 때문에
		
		tv1.powerOn();              //SamsungTV 메소드가 출력된다
		tv.powerOff();
		
		tv1.volumeUp();
		tv1.volumeDown();
				
	}
}
