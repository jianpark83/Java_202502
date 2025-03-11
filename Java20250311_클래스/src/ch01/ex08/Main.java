package ch01.ex08;

public class Main {

	public static void main(String[] args) {

		A aa = new A();
		
		B bb = new B();    //B의 디폴트 생성자를 먼저 찾아간다. 상속중일 경우 상위클래스로 찾아가서 값을 찾음
		
		B b2 = new B("지리산", 50, "전라남도 남원시!");
	
		
		b2.info();   //재정의 했을 경우 본인꺼를 끌어온다
    }
}
