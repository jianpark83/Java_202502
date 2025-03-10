package ch04.ex01;

public class WhileExam01 {

	public static void main(String[] args) {
		/*
         * int sum = 0;
		         초기값   조건   증감/감소(변동)
		   for(int i=1; i<=5; i++) 
			sum += i;    
		   }
		   System.out.println("sum = " + sum);
		   아래와 같은 조건식이다
         */
		
		int sum=0;
		int i=1;        //초기값
		
		while(i<=5) {   //조건
			sum +=i;    //증감
			i++;        //탈출조건, 없으면 무한반복
		}
        System.out.println("sum=" + sum);
		
		
	}

}
