package ch01.ex01;

public class Car {

	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
/*	
 *  String getCompany(){   //
		return company;
	}
	
	void setColor(String color) {   
		this.color = color;
	}
*/	
//중간에 값을 변경하고 싶을 경우 setter 를 이용한다
//위 주석과 같이 직접 입력하는 대신 "메뉴 - Source - Generate Getters and Setters.." 에서
//설정하면 하단에 자동으로 입력가능하다
	
	public Car() {   //기본생성자 = 디폴트 생성자
		/*this.company = "현대";
		this.model = "그랜져";
		this.color = "검정";
		this.maxSpeed = 250;
		*/
		this("현대", "그랜져", "검정", 250);   //주석 내용과 동일하다
		                                   //다른 생성자를 불러온다(다른 생성자 호출), 4개짜리 받을 수 있는
	}    
	
	public Car(String company, String model) {  //생성자
		/*this.company = company;
		this.model = model;
		this.color = "검정";
		this.maxSpeed = 250;
		*/
		this(company, model, "검정", 250);  //주석 내용과 동일하다
	}
	
	public Car(String company, String model, String color, int maxSpeed) {  //생성자 - 멤버변수 초기화 목적
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void run() {
		System.out.println(company + " 달린다.");
	}
	
	public void displayInfo() {
	    System.out.println(company);	
	    System.out.println(model);	
	    System.out.println(color);	
	    System.out.println(maxSpeed);	   
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
//생성자를 몇개 만들지는 개발자가 정한다