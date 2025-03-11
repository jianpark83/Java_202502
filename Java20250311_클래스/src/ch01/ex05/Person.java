package ch01.ex05;

/*
 * static(정적) <==> 인스턴스
 * 인스턴스 변수(멤버변수), 인스턴스 메소드(멤버메소드)
 * 정적변수, 정적메소드
 */
public class Person {       
	
	private String name;
	private int age;
	
	//공유자원 => count, func
	static int count;  //정적변수
	                     
	static void f1() {}
	
	static void func() {
		System.out.println("정적메소드 func()");
		count++;
		f1();
		//age++;   사용할 수 없다
		//eat();
		//일반 메소드는 객체가 생성되야만 메모리에 올라간다. 그렇기 때문에 사용할 수 없다
	}
	
	public Person(String name, int age) {  
		this.name = name;      
		this.age = age;
	}
	
	String dispalyInfo() {
		return name + " : " + age;
	}
	
	//일반메소드에서는 인스턴스 변수, 인스턴스 메소드, 정적변수, 정적메소드 모두 불러다 써도 문제없다
	public void run() {   
		count++;
		func();
		eat();
		System.out.println("run......");                
	}                          

	public void eat() {
		System.out.println("eat......");	
	}
}
//static 키워드 붙으면 객체 생성하기 전에 메모리에 올라간다
