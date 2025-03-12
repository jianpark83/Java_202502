package ch01.ex03;

public class CarExample {

	public static void main(String[] args) {

		
		Car myCar =  new Car();
		
//		myCar.run();   참조하고 있는 대상이 없어서 에러발생
		
		
		myCar.tire = new Tire();
		myCar.run();
		
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
