package ch01.ex01;

import java.util.Scanner;

public class 복습5 {

	public static void main(String[] args) {
     
		//객체    참조변수
		Scanner sc =  new Scanner(System.in);
		System.out.println("정수입력>>");
		int number =  sc.nextInt();
		String msg = "";
		
		//삼항연산자(조건연산자)
		// (조건판단) ? 참 : 거짓;
//      String msg = (number>0) ? "양수" : (number == 0) ? "영" : "음수" ;
//      System.out.println(msg);
		
		if(number>0) {
			msg = "양수";
		}else if(number == 0) {
			msg = "영";
		}else {
			msg = "음수";
		}
		
		//  if(number>0) 
		//  	msg = "양수";
		//  else if(number == 0) 
		//  	msg = "영";
		//  else 
		//  	msg = "음수";
		// 문장이 하나일 경우 위와 같이 중괄호 생략 가능
	
		System.out.println(msg);
	}
		

}
