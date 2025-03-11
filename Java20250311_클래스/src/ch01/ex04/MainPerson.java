package ch01.ex04;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person("설악산", 50);  
		Person p2 = new Person("지리산", 30);
		
		System.out.println(p1.dispalyInfo());
	
		p1.setName("내장산");   //내장산으로 바꾸고 싶을때 setter 이용
		p1.setAge(111);
		
		System.out.println(p1.dispalyInfo());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}
}
