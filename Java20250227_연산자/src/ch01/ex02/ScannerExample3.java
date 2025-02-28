package ch01.ex02;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) throws Exception{

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();       //문자열로 인식
		int x =  Integer.parseInt(strX);        //정수로 바꿔줌, 숫자로 입력된 것만 바꿀 수 있다(문자 x)
		
		System.out.print("y 값 입력: ");          //문자열로 인식
		String strY = scanner.nextLine();       //정수로 바꿔줌
		int y = Integer.parseInt(strY);
		
		int result = x + y;                     //정수 합산
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) {                           //무한 반복 실행
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {              //데이터에 q를 입력하면 종료
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		
		System.out.println("종료");
		
	}		
}

