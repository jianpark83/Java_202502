package ch01.ex04;

import java.util.Scanner;

public class 통장관리 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int balance = 0;   //잔고
		boolean flag = true;
		
		while(flag) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			
			System.out.println("선택> ");
			//문자열을 정수형으로 변환
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1:
				System.out.println("예금액> ");
//				balance += sc.nextInt();       쓰려고 할 경우 버퍼 비우기 해야한다, int의 경우 숫자반 가져오고 엔터가 남아있기 때문
				balance += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("출금액> ");
				balance -= Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				flag = false;
				break;
			}  //switch 문
		}  //while 문
		System.out.println("프로그램 종료");
	
	}

}
