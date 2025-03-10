package ch01.ex01;

class A{
	String name;
	int age;
	
	A(){}
	A(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void run() {
		System.out.println("run()");
	}
	
	void eat() {
		System.out.println("eat()");
	}
}

//B클래스가 상위클래스인 A클래스를 상속하겠다.란 의미
class B extends A{    //상위클래스 멤버변수에 접근할 수 있다. private가 없기 때문에
	String id;
	
	B(){}
	B(String name, int age, String id){
		super(name, age);   
		this.id = id;
	}
}

final class C extends B{   //final 이 붙어있기 때문에 더이상 상속하지 않겠다. 라는 뜻
	String pw;
 
	C(){}
	C(String name, int age, String id, String pw){  //생성자
		super(name, age, id);          //super는 윗줄에 
		this.pw = pw;
	}
	
    void displayInfo() {
	    System.out.println("A class : " + name);
	    System.out.println("A class : " + age);
	    System.out.println("B class : " + id);
	    System.out.println("C class : " + pw);
    }
}

//class D extends C{
//	
//}

public class Main {

	public static void main(String[] args) {
		
		C cc = new C();
		cc.displayInfo();
		System.out.println();
		
		C c = new C("홍길동", 20, "test", "1234");   //객체를 전달받을 때 한개는 C가 갖고
		c.displayInfo();
		
	}
}
//상위클래스는 하위클래스에 접근할 수 없다
//하위클래스는 상위클래스를 언제든 가져다 쓸 수 있다
//단, private 가 붙어 있으면 가져다 쓸 수 없다
//다중 상속을 허용하지 않는다