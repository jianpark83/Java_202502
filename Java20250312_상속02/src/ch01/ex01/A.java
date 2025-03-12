package ch01.ex01;
//자동타입변환
public class A {
    private String name;
	
    A(){}
    A(String name){
    	this.name = name;
    }
    
    void funcA() {
    	System.out.println("funcA()");
    }
}

class B extends A{
	private String address;
	
	B(){}
	B(String n1, String a){
		super(n1);
		this.address = address;
	}

	void funcB() {                    //메소드
		System.out.println("funcB()");
	}
}

class C extends B{
	private int age;
	
	C(){}
	C(String n, String a, int age){   //name로 하지 않아도 됨, 위 name과 별개임
		super(n, a);
		this.age = age;
	}
	
	void funcC() {
		System.out.println("funcC()");
	}
}