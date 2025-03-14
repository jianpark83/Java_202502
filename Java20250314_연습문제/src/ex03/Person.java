package ex03;

public class Person {
	
	private String name;
	
	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	
	public String getInfo() {
		return name + "  ";
	}
}
