package ch01.ex04;

class CarMain {

int speed;
	
	void run() {
        speed = 100;		
	}
	
	void eat() {
		speed = 100;
	}
	
	public static void main(String[] args) {
        //speed = 100;    
		//불가, main 안에서는 아래와 같이 반드시 객체를 생성 후 사용해야 한다
		CarMain car = new CarMain();
		car.speed = 200;
		System.out.println("main()");
	}
}