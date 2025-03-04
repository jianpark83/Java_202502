package ch01.ex01;

import java.util.Scanner;

public class 복습4 {

	public static void main(String[] args) {
     
		//객체    참조변수
		Scanner sc =  new Scanner(System.in);
		System.out.println("정수입력>>");
		int number =  sc.nextInt();
		
		//삼항연산자(조건연산자)
		// (조건판단) ? 참 : 거짓;
		//String msg = (number>0) ? "양수" : "음수" ;
		//문장이 하나이면 중괄호 생략 가능, 하나 이상일 경우 중괄호 필수
		
		String msg = "";
		if(number >= 0) {
			msg = "양수";
		}else {
			msg = "음수";
		}
		
		//중괄빼 뺐을 경우 아래와 같이 해도 무방하다(문장이 하나일 경우)
		//String msg = "";
		//if(number >= 0) msg = "양수";
		//else msg = "음수";
		
		System.out.println(msg);
	}

}
