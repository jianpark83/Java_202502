package ch01.ex03;

/* 생성자 오버로딩
 * 사람 클래스
 * 사람 특징 - name, age, height, weight, ...
 * 사람 동작 - run, sleep, eat, study, work, ...
 * 
 * 간추려 내는 과정을 추상화.. //클래스를 만든다 -> 자료형을 만든다
 */
public class Person {       
	
	private String name;
	private int age;
	
	public Person(){
		this("남산", 1);
		//name = "남산";   
		//age = 1;
	}   
	
	public Person(String name) {
		this(name, 1);
		//this.name = name;
		//age = 1;
	}
	
	public Person(String name, int age) {  //기본생성자와 모두 받아줄 수 있는 생성자 2개를 꼭 만들어야 한다
		this.name = name;       //집결지, 제약조건을 넣을 수 있다
		this.age = age;
	}
	
	String dispalyInfo() {
		return name + " : " + age;
	}
	
	public void run() {      
		System.out.println("run......");                
	}                          

	public void eat() {
		System.out.println("eat......");	
	}
}
