package ch01.ex02;

/*
 * 사람 클래스
 * 사람 특징 - name, age, height, weight, ...
 * 사람 동작 - run, sleep, eat, study, work, ...
 * 
 * 간추려 내는 과정을 추상화.. //클래스를 만든다 -> 자료형을 만든다
 */
public class Person {       
	
	private String name;
	private int age;
	
	
	public void run() {  //함수를 만들 땐 위 경우에 맞춰서
		                 //public를 붙였기 때문에 다른 패키지에서 접근 가능, 없으면 해당 패키지에서만 사용 가능
		System.out.println("run......");                
	}                          

	public void eat() {
		System.out.println("eat......");	
	}
}

//모든 자바는 object가 존재, 모든 클래스가 object 상속이 가능하다