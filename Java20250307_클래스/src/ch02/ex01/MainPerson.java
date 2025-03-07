package ch02.ex01;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person("박지안");
//		p1.name = "박지안";       //멤버변수는 private 이기 때문에 외부 접근 불가
	
//		p1.run();               //외부에서 접근 불가
		p1.eat();
		
		Person p2 = new Person("홍길동", 20, "000-1111-2222");
		
		p2.eat();
		
//		Person p3 = new Person();
		p2.setName("까미");      //setName 변수값을 바꿀수 있다고 직관적으로 알 수 있다 
		p2.eat();
		p2.setAge(100);

		String name = p2.getName();
		int age = p2.getAge();
		
		System.out.println(name);
		System.out.println(age);
	}
}
