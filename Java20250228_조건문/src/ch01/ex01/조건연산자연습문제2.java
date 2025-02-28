package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제2 {

	public static void main(String[] args) {
        /*
         * 키보드 통해서 국어점수, 영어점수 입력 받는다.
         * 국어점수, 영어점수 둘다 70이상이면 합격, 아니면 불합격
         */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력: ");
		int korScore = sc.nextInt();
		
		//sc.nextInt();            //버퍼 enter키 비우기, 필요할 때
		
		System.out.print("영어점수 입력: ");
		int engScore = sc.nextInt();
		
		
		//(조건) ? 참 : 거짓
		
		String result = (korScore >= 70) && (engScore >=70) ? "합격" : "불합격";                                        
		System.out.println(result);
	

		
	}

}
