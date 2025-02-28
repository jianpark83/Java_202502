package ch01.ex02;

public class IfExam02 {

	public static void main(String[] args) {

		/*
		 * 조건문
		 * 1. if        //조건을 만족하면 if뒤 실행문 실행
		 * 2. if ~ else //조건을 만족하면 if뒤 실행문 실행, 만족하지 못하면 else뒤 실행문 실행
		 * 3. if ~ else if ~ else
		 * 
		 * switch 문  //3번을 직관적으로 볼 수 있게 만든 실행문
		 */
		
		int kor = 60;             
		
		
		if(kor >= 70) {                           //중괄호로 구분
			System.out.println("합격");            //조건이 참이면 if뒤 조건을 실행, 거짓이면 else뒤 조건을 실행
		}else {
			System.out.println("불합격");
		}
		
		
		System.out.println("종료");
		
	}

}
