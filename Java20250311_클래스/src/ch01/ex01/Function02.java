package ch01.ex01;

/*
 * 반환 O, 매개변수 O
 */
public class Function02 {

	public static void main(String[] args) {

		
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1, num2);    
		
		System.out.println("result = " + result);
	}

	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
}
//객체 생성하지 않고 메소드 호출하는 방법 -> static 키워드 붙여준다
//static를 붙이는 것 객체 생성하지 않고 쓰겠다!
//함수에서 체크