package ch01.ex02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		//키보드 통해서 입력을 받기!
		
		System.out.print("문자 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		
		//String str = sc.nextLine();       //문자로 받으려면 string

		int str = Integer.parseInt(sc.nextLine());       //정수로 입력을 받으려면 int로
		
		// "a" + "b" => "ab"
		str = str + 10;      // "10" + 10 -> "10" + "10" -> 1010 (문자 10과 문자 10으로 인식)
		
		System.out.println("입력된 값 : " + str);
		
		
		

		
		
	}

}
