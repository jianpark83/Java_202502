package ch01.ex04;

import java.util.Scanner;

public class 학생점수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int number = 0;
		int[] scores = null;
		
		
		while(flag) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			
			System.out.println("선택> ");
			number = Integer.parseInt(sc.nextLine());
			
			if(number == 1) {
				System.out.println("학생수> ");
				int index = Integer.parseInt(sc.nextLine());
				scores = new int[index];
			}else if(number == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> ", i);
				  //System.out.printf("scores["+ i + "]>");        이와 같이 해도된다
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}else if(number == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+ i + "]:" + scores[i]);
				}
			}else if(number == 4) {
				int sum = 0;
				int max = scores[0];
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];   //합계 누적
					
					if(max<scores[i])   //최고점수
						max = scores[i];
				}
				System.out.println("최고점수: " + max);
				System.out.println("최고점수: " + (double)sum/scores.length);
			}else if(number == 5) {
				flag = false;
			}
			
		}  //end while
		System.out.println("프로그램 종료!");
	
	}

}
