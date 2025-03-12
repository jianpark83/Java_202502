package ch01.ex02;

/*
 * ## 상속 전제 조건 ##
 * 1.하위클래스는 상위글래스 자원 접근 가능(단, private 제외)
 * 2.상위클래스는 하위클래스 접근 불가
 */
public class MainClass {

	public static void main(String[] args) {

		A a1 = new A();
		a1.test();
		
		B b1 = new B();
		b1.test();   //가까이 먼저, 내꺼먼저 출력된다
		
		C c1 = new C();
		c1.test();
		
		System.out.println("-------다형성-------");
		
		A a2 = new C();
		a2.test();
		
		A a3 = new B();
		a3.test();
		
		B b2 = new C();
		b2.test();
		
		
		
	}
}
