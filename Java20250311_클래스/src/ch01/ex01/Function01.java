package ch01.ex01;

/*
 * 반환 O, 매개변수 O
 */
public class Function01 {

	public static void main(String[] args) {

		Function01 f1 = new Function01();   //객체 생성해야 실행 가능
		                                    //메소드를 호출할 땐 반드시 객체 생성해야 함
		int num1 = 10;
		int num2 = 20;
		
		int result = f1.add(num1, num2);    
		
		System.out.println("result = " + result);
	}

	int add(int n1, int n2) {
		return n1 + n2;
	}
	
}
