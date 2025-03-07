package ch06.ex07.exam07;

public class Member {

	//p.280 13번 문제
	
	private String name;
	private String id;
	private String password;
	private int age;
	
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	void displayInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(password);
		System.out.println(age);
		
	}
	
}
