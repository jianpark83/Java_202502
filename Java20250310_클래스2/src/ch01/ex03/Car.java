package ch01.ex03;

public class Car {

	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	public static int count;  //정적 변수   
	                          //static 은 public 가 일반적인 형태
	                          //static 키워드가 붙으면 공유자원으로 쓰인다, 각각 클래스에서 함께 사용할 때
	
	//정적 변수
	static String companyState = "GM";
	
	static void stateFunc() {}
	
	//정적 메소드 => 사용하는 이유는 공유자원으로 쓸 때
	public static void runState() {
		//정적메소드 안에서 사용할 수 있는 변수 및 메소드는
		//static 이 붙어 있는 정적메소드 정적변수만 사용 가능
		//정적이 붙어있는 변수만 아용 가능
		System.out.println("Static Run()");
		count++;
		companyState = "기아";
	    stateFunc();
	    //company = "현대";   사용X
	    //run();   사용X
		}
	
	public Car() {
		//this(), super() => 함수 맨 앞 와야함
		this("현대", "그랜져", "검정", 250); //다른 생성자 호출
		//System.out.println(++count);   
		System.out.println(++Car.count);  //윗줄과 같은 내용
	}    
	
	public Car(String company, String model, String color, int maxSpeed) {  
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void displayInfo() {
	    System.out.println(company);	
	    System.out.println(model);	
	    System.out.println(color);	
	    System.out.println(maxSpeed);	   	
	}
}
