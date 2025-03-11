package ch01.ex01;

import java.util.Scanner;

/*
 * 반환 O, 매개변수 X
 */
public class Function03 {

	public static void main(String[] args) {

		String result = add();    
		
		System.out.println("result = " + result);
	}

	static String add() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력>> ");
		
//		String name = sc.nextLine();
//		return name;
		
		return sc.nextLine();   // => 입력받은 걸 바로 반환시켜도 가능하다(위 두줄을 간단하게)
		                        //효율적: 코드도 줄고, 메모리 공간도 적고
	}
	
}
