package ch01.ex03;

/*
 * 2개 값을 입력받아서, 더하는 기능을 수행
 * 매개변수 O, 반환 X
 */
public class Add02 {

	public static void main(String[] args) {

		System.out.println("main함수 시작");
		
		int num1 = (int)(Math.random()*100) +1;            //1~100까지 랜덤하게 발생
		int num2 = (int)(Math.random()*100) +1;            //1~100까지 랜덤하게 발생
		
		add(num1, num2);
		
		
		System.out.println("프로그램 종료!");
	}
	
	public static void add(int numA, int numB) {   
		
		System.out.println("add() 시작");
		
		System.out.println(numA + " + " + numB + " = " + (numA+numB));
		
		//return 없음
	}
}


