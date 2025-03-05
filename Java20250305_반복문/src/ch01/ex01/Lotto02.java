package ch01.ex01;

import java.util.Random;

public class Lotto02 {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int 배열
		 * 로또는 1~45 랜덤하게 저장
		 * 단, 중복불가
		 */
		
		int[] lotto = new int[45];
	    
		for(int i=0; i<lotto.length; i++) {  
			
			int temp = (int)(Math.random()*45)+1;
			lotto[i] = i+1;
		}
		
		//배열 섞기
		for(int i=0; i<1000; i++) {                 //500번 섞겠다
			int index = (int)(Math.random()*45);    //0~44
			                                        
			int temp = lotto[0];                    //자리 섞는 코드
			lotto[0] = lotto[index];
			lotto[index] = temp;
		}
		System.out.println("이번 주 예상 로또 번호: ");
		
		for(int i=0; i<6; i++)                      //500번 섞은 후 배열 45개칸 중 앞자리 6자리만 결과값으로 출력
			System.out.print(lotto[i] + " ");
		
	}

}
