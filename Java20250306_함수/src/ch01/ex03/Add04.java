package ch01.ex03;

/*
 * 2개 값을 입력받아서, 더하는 기능을 수행
 * 매개변수 O, 반환 O
 */
public class Add04 {

	public static void main(String[] args) {
		
		System.out.println("main함수 시작");
								
		int num1 = (int)(Math.random()*100) +1;       //1~100까지 랜덤하게 발생
		int num2 = (int)(Math.random()*100) +1;       //1~100까지 랜덤하게 발생
		
		int result = add(num1, num2);					
		
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
	}
	
	public static int add(int numA, int numB) {       //매개변수
		
		System.out.println("add() 시작");		

		int sum = numA + numB;
		
		System.out.println("numA= " + numA + ", numB= " + numB);  //확인하기 위해 출력해봄
	
	    return sum;           //반환값을 받아줄 수 있는 변수가 필요 => result : 1개 값만 전달 가능
	    				
	}
}


