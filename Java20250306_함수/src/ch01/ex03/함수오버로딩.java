package ch01.ex03;

public class 함수오버로딩 {

	public static void main(String[] args) {

	}

	public static void functionA() {
		System.out.println("functionA()");
	}
	
	public static void functionA(int n) {      
		System.out.println("functionA(int n)");
	}
	
	public static void functionA(double n) {
		System.out.println("functionA(double n)");
	}
	
	public static void functionA(int n1, int n2) {
		System.out.println("functionA(int n1, int n2)");
	}
}


//함수오버로딩, 함수 이름이 똑같은데 매개변수가 다른 것 