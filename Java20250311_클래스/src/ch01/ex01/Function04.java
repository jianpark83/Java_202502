package ch01.ex01;

import java.util.Scanner;

/*
 * 반환 X, 매개변수 X
 */
public class Function04 {

	public static void main(String[] args) {

		add();    //리턴값이 없기 때문에,   매개변수 없음
		
		System.out.println("result = ");
	}

	static void add() {   //반환타입이 없다는 것 void
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력>> ");
		
//		String name = sc.nextLine();		
		System.out.println(sc.nextLine());  //윗줄과 같은 내용

		return ;   	            //반환 타입이 없다는거 아예 리턴 값을 없애던가                
	}
}
