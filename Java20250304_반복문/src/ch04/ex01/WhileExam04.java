package ch04.ex01;

public class WhileExam04 {

	public static void main(String[] args) {
	         /*
	          * int sum = 0;
				
				for(int i=1; i<=100; i++) {  //1~100까지 반복   
					if(i % 2 == 1) {         //홀수 이니? , 짝수는 (i % 2 == 0)
					sum += i;                //홀수이면 누적
					}
				}
				System.out.println("sum = " + sum);
	          */
		
			
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			if(i % 2 == 1)
				sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
