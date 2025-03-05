package ch01.ex01;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int 배열
		 * 로또는 1~45 랜덤하게 저장
		 * 단, 중복불가
		 */
		
		int[] lotto = new int[6];                     //1부터 6회 반복
		boolean flag = false;
		
	 
		for(int i=0; i<lotto.length; i++) {  
			
			int temp = (int)(Math.random()*45)+1;     //랜덤한 숫자 추출
			   
			//중복 체크 과정 필요
			for(int j=0; j<lotto.length; j++) {
				if(temp == lotto[j]) {
					flag = true;
				    break;
				}
			}
			
			if(flag !=true)      //중복되지 않았을때 처리
			    lotto[i] = temp;
			else                 //중복된 경우 처리
				i--;             //랜덤으로 추출한 값이 같을 경우 배열에 넣지 못하기 때문에 i값 -1 감소시켜서 다시 랜덤 추출된 번호를 비교한다
			    flag = false;    //중복된 경우 true값으로 변경된 값을 원 상태로 변경(flase)
		}
		
		System.out.println("이번 주 예상 로또 번호: ");
		
		//출력
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i] + " ");
		
	}

}
