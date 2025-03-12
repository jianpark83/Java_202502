package ch01.ex02;
//다형성
public class A {
    private String name;
	
    A(){}
    A(String name){
    	this.name = name;
    }
    
    void test() {
    	System.out.println("A class");
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
	@Override
    void test() {   //메서드 오버라이딩
    	System.out.println("B class");   
    }
    
	void funcB() {                   
		System.out.println("funcB()");
	}
}

class C extends B{
	private int age;
	
	C(){}
	C(String n, String a, int age){   
		super(n, a);
		this.age = age;
	}
	@Override
    void test() {
    	System.out.println("C class");
    }
	
	void funcC() {
		System.out.println("funcC()");
	}
}