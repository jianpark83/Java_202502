package ch01.ex03;

/*
 * 2개 값을 입력받아서, 더하는 기능을 수행
 * 매개변수 X, 반환 O
 */
public class Add03 {

	public static void main(String[] args) {

		System.out.println("main함수 시작");
				
		int result = add();		
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
	}
	
	public static int add() {    //매개변수 X
		
		System.out.println("add() 시작");
		
		int num1 = (int)(Math.random()*100) +1;            //1~100까지 랜덤하게 발생
		int num2 = (int)(Math.random()*100) +1;            //1~100까지 랜덤하게 발생
		int sum = num1 + num2;
		
		System.out.println("num1= " + num1 + ", num2= " + num2);  //확인하기 위해 출력해봄
	
	    return sum;
	    				
	}
}


