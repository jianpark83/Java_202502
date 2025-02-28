package ch01.ex02;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {

		//키보드 통해서 입력을 받기!
		
		System.out.print("문자 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();       //오른쪽 실행결과의 '정수 값 입력 '의 데이터를 끌어온다
		
		System.out.println("입력된 값 : " + str);
		
		System.out.print("정수 입력 : ");     //정수만 입력해야 한다
		
		int num = sc.nextInt();      //같은 타입으로, 예)앞뒤 int
		
		System.out.println("입력된 값 : " + num);
		

		
		
	}

}
