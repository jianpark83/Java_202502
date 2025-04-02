package ex01;

public class Human {
	
	private String name;
	private int age;
	private int height;
	private int weight;

	public Human() {}	
	public Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String printInformation() {   //반환타입 String (값을 찍어주는 용도)
      return name + "\t" + age + "\t" + height + "\t" + weight + "\t";    
	}
	
	public String toString() {   //반환타입 String (값을 찍어주는 용도)
	      return name + "\t" + age + "\t" + height + "\t" + weight + "\t";  
	}
}