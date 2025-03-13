package ex05;

/*
 * 메소드 4개
 * 전원 키고, 끄는 기능
 * 사운드 올리고, 내리는 기능 담당하는 메소드
 */

public abstract class TV {  //abstract 입력해야함
/*
 * 클래스 내부에 추상클래스가 1개 이상
 * 존재하면 그 클래스는 추상 클래스이다.
 */

	boolean power;
	int volume;
	
	TV(){
		power = false;
		volume = 0;
	}
	//추상메소드 --> {}가 없다. --> 메소드 자체가 완성되지 못했다(미완성 메소드)
	abstract void powerOn();    //==> 반드시 재정의
	
	abstract void powerOff();   //==> 반드시 재정의
	   
	abstract void volumeUp();   //==> 반드시 재정의
 
	abstract void volumeDown(); //==> 반드시 재정의
	
	void test() {
		
	}
	
}
//추상클래스를 상속한 클래스는 반드시 추상클래스의 바디부분을 채워야 한다(완성하기) ==> 강제화시킴
//추상클래스안에 일반 메소드가 존재할 수 있다. 일반 메소드는 재정의 해도 되고 안해도 되고 선택!