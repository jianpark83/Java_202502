package ch02.ex05.test;

public class MainCar {

	public static void main(String[] args) {

		Car car = new Car("기아자동차", "K8", "2023");
		
		car.startengine();
		
		car.displayInfo();
	}

}
