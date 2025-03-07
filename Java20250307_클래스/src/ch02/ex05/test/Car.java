package ch02.ex05.test;

/*
 * Car 클래스
 
   요구사항
   1. brand(브랜드), model(모델명), year(연식)을 필드로 가짐
   2. 생성자를 통해 brand, model, year를 설정할 수 있음
   3. startengine() 메서드를 구현하여 “[brand][model]의 엔진이 시작되었습니다!” 를 출력하도록 함
   4. displayInfo() 메서드를 구현하여 “자동차 정보: [year]년식 [brand][model]”을 츨력하도록 함
   5. main 메서드에서 Car 객체를 생성하고 startEngine() displayInfo()를 호출하여 실행 결과를 확인할 것
 */
public class Car {

	private String brand;
	private String model;
	private String year;
	
	Car(String brand, String model, String year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		
	}
	
	void startengine() {
//		System.out.println("[" + brand + "][" + model + "]의 엔진이 시작되었습니다!"); -> 아래와 같은 결과값을 출력한다
        System.out.printf("[%s] [%s]의 엔진이 시작되었습니다!\n", brand, model);
	}
	
	void displayInfo() {
		System.out.println("자동차 정보: [" + year + "]년식 [" + brand + "] [" + model + "]");
	}
}
