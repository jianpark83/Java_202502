package ex05;

public class LgTV extends TV{
	
	@Override   
	void powerOn() {
	     System.out.println("LGTV.");
	     System.out.println("전원 ON");
	}
	
	void powerOff() {
	     System.out.println("LGTV.");
	     System.out.println("전원 OFF");	     
	}
	   
	void volumeUp() {
	     System.out.println("LGTV.");
	     System.out.println("볼륨 up");	    
	}
	   
	void volumeDown() {
	     System.out.println("LGTV.");
	     System.out.println("볼륨 down");	      	
	}
}

